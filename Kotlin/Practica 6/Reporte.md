## 1.1: Crear el proyecto con dos Activities

> *Cree una app con las siguientes características:*
<img src="Capturas\1.PNG"/>

> *Cree la segunda Activity yendo al panel Project > Android y dar clic derecho sobre la carpeta app de su proyecto y dar a New > Activity > Empty Activity, nombre este activity como Segunda*

<img src="Capturas\2.png">
<img src="Capturas\3.png">

> *Use el mismo nivel de API y el lenguaje de programación Kotlin. Al final crearemos dos Activities con las siguientes características*

## 1.2: Diseñando la primera Activity

> *Se crea el diseño de la interfaz de usuario para la aplicación Dos Actividades en el editor de diseño mediante las características ConstraintLayout.* 

### Detallando las propiedades del activity_main

> *Abra activity_main.xml desde el panel Proyecto > Android si aún no está abierto. Si la pestaña Design (diseño) aún no está seleccionada, haga clic en ella.*

<img src="Capturas\4.png">

> *A continuación, se le presenta la estructura del activity, su trabajo será diseñar en base a lo mostrado, es posible que no obtenga el mismo diseño solicitado, pero se le recomienda explorar al momento de crear, es libre de diseñar a su manera, pero cuidando la estructura otorgada.*

<img src="Capturas\5.png">

> *Establezca la propiedad visibility a invisible a los TextView del activity_main, estos serán activados en el momento en que la segunda activity le mande un resultado, en primera instancia están ocultos.*

<img src="Capturas\6.png">

> *Establezca el evento onClick al botón del activity_main que tiene el identificador btEnviar, puede usar el siguiente código XML. Puede usar la corrección automática para generar el código correspondiente a este manejador de evento.*

<img src="Capturas\7.png">

### Agregando un Intent al MainActivity.kt

> *Abra el fichero MainActivity.kt*

> *Agregue un object companion dentro de la clase MainActivity, no dentro de algún método, este servirá para simular un objeto estático que no cambia el valor de sus propiedades en toda la aplicación. El valor EXTRA_MESSAGE nos servirá para la clave del extra en el intent.*

<img src="Capturas\8.png">

> *Agregue el siguiente código en el método lanzarSegundaActivity, relacionado a la creación de un intent*

<img src="Capturas\9.png">

> *Muestre el resultado en el momento en que la segunda activity fue lanzada*

 <img src="Capturas\10.png">

## 1.3: Compartiendo datos de Activity principal a la segunda

>*Agregue el siguiente código para enviar datos activities, debe reemplazar el código anterior del método lanzarSegundaActivity. Muetre los resultados*
