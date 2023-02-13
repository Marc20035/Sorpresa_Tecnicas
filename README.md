# Sorpresa_Tecnicas
# NOTAS:
* Este es mi repositorio: https://github.com/Marc20035/Sorpresa_Tecnicas.git
# Ejercicio:
El patrón Abstract Factory proporciona una manera clara y organizada de crear objetos relacionados, sin tener que especificar exactamente qué objetos se crean. Esto permite una mayor flexibilidad y escalabilidad, ya que se pueden agregar nuevos tipos de diálogos o fábricas sin afectar la estructura existente. También ayuda a mejorar la cohesión y la modularidad del código, ya que los componentes están claramente separados y responsables de su propia tarea específica. A continuación debes realizar de manera individual este pequeño ejemplo:

En este ejercicio se crean dos clases diferentes de diálogos: DialogoWindows y DialogoMac, cada una con su propia implementación de la interfaz Dialogo. 

Luego, se definen dos fábricas abstractas: FabricaDialogoWindows y FabricaDialogoMac, que se encargan de crear los diálogos específicos correspondientes. 

La clase Cliente actúa como el cliente de la fábrica abstracta, creando diálogos a través de la fábrica sin tener que conocer los detalles de implementación de los diálogos.
