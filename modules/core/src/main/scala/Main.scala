import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp{
  override def run(args: List[String]): IO[ExitCode] =
    program.as(ExitCode.Success)

  def program[F[_]]: IO[Unit] = ???
}

