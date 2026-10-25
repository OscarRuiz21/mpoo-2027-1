// CONTEXTO: Controlaremos el uso del protector solar
// QUE SABE Y POR QUE: fps (factor de proteccion solar), marca (identificar), waterproof (sirve en alberca), contML (cuanto producto tiene)
// QUE SABE HACER Y POR QUE:reaplicar(double) es void porque solo reduce contML; necesitaComprar() retorna boolean para avisar cuando quede poco producto (true or false); esAdecuadoParaPlaya() retorna boolean para validar waterproof
//                           
// QUE IGNORE: el color, forma y aroma del producto no afecta porque no tiene relevancia
public class ProtectorSolar {  

// CONSTANTEEEE 
static final int FPS_MINIMO_PLAYA = 30; // constante 

// ===== ATRIBUTOS (etiqueta cada parte) =====
String marca;               // tipo: String · nombre: marca · valor inicial: null
int fps;                    // tipo: int · nombre: fps · valor inicial: 0
double contML = 50.0;       // tipo: double · nombre: contML · valor inicial: 50.0
boolean waterproof;         // tipo: boolean · nombre: waterproof · valor inicial: false

// ===== CONSTRUCTOR (obligatorio en UNA de tus tres clases) =====
// firma: reaplicar(double) · retorno: void · parametro: double mlUsados

ProtectorSolar(String marca, int fps, boolean waterproof) {
        this.marca = marca;           // this.marca = ATRIBUTO · marca = PARAMETRO
        this.fps = fps;               // this.fps = ATRIBUTO · fps = PARAMETRO
        this.waterproof = waterproof;
    }


// ===== METODOS (etiqueta cada parte y su firma) =====
// firma: reaplicar(double) · retorno: void · parametro: double mlUsados
void reaplicar(double mlUsados) {
        contML -= mlUsados; // operador abreviado -=
    }

// firma: necesitaComprar() · retorno: boolean · sin parametros
boolean necesitaComprar() {
        return contML < 10.0; // operador relacional <
    }

// firma: esAdecuadoParaPlaya() · retorno: boolean · sin parametros
boolean esAdecuadoParaPlaya() {
        return fps >= FPS_MINIMO_PLAYA && waterproof; // operadores >= y &&
    }
public static void main(String[] args) {
        System.out.println("RADIOGRAFIA: ProtectorSolar");

// 1: crea tu objeto (con new MiObjeto(...) si le pusiste constructor) y asigna lo que falte
ProtectorSolar bloqueador = new ProtectorSolar("Beauty of Joseon", 50, true);

// 2: imprime cada atributo
System.out.println("[estado inicial]");
System.out.println("marca = " + bloqueador.marca);
System.out.println("fps = " + bloqueador.fps);
System.out.println("contML = " + bloqueador.contML);
System.out.println("waterproof = " + bloqueador.waterproof);

// 3: firma + invocacion + resultado
System.out.println("\n[invocando metodos]");
bloqueador.reaplicar(5.5);
System.out.println("reaplicar(double) -> void; contML = " + bloqueador.contML);
System.out.println("necesitaComprar() -> boolean; " + bloqueador.necesitaComprar());
System.out.println("esAdecuadoParaPlaya() -> boolean; " + bloqueador.esAdecuadoParaPlaya());

int mlEnteros = (int) bloqueador.contML; // casting explicito
System.out.println("casting (int) 44.5 = " + mlEnteros);

// 4: imprime atributos otra vez
System.out.println("\n[estado final]");
        System.out.println("contML = " + bloqueador.contML);
    }
}