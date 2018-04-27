# WeatherApp

The MVP pattern allows separate the presentation layer from the logic, so that everything about how the interface works is separated from how we represent it on screen. Ideally the MVP pattern would achieve that same logic might have completely different and interchangeable views.
First thing to clarify is that MVP is not an architectural pattern, it’s only responsible for the presentation layer . In any case it is always better to use it for your architecture that not using it at all.

Separating interface from logic in Android is not easy, but the Model-View-Presenter pattern makes a little easier to prevent our activities end up degrading into very coupled classes consisting on hundreds or even thousands of lines. In large applications it is essential to organize our code well. If not, it becomes impossible to maintain and extend.
