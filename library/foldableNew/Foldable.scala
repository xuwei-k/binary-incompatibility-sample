package com.example

trait FoldableParent[F[_]] { self: Foldable[F] =>
  def toList[A](fa: F[A]): List[A] =
    foldLeft(fa, List.empty[A])((xs, x) => x :: xs).reverse
}

trait Foldable[F[_]] extends FoldableParent[F] {
  def foldLeft[A, B](fa: F[A], z: B)(f: (B, A) => B): B
}
