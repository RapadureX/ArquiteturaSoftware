����   9 _
       Composite/ElementoDoQuestionario <init> (Ljava/lang/String;)V  java/util/ArrayList
  
   ()V	      Composite/Bloco 	elementos Ljava/util/List;	      java/lang/System out Ljava/io/PrintStream;	     	Descricao Ljava/lang/String;      makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;
 ! " # $  java/io/PrintStream println & ' ( ) * java/util/List iterator ()Ljava/util/Iterator; , - . / 0 java/util/Iterator hasNext ()Z , 2 3 4 next ()Ljava/lang/Object;
  6 7  Exibir & 9 : ; add (Ljava/lang/Object;)Z & = > ; remove 	Signature 4Ljava/util/List<LComposite/ElementoDoQuestionario;>; Code LineNumberTable LocalVariableTable this LComposite/Bloco; 	descricao MethodParameters elemento "LComposite/ElementoDoQuestionario; StackMapTable 	adicionar %(LComposite/ElementoDoQuestionario;)V remover 
SourceFile 
Bloco.java BootstrapMethods R
 S T U  V $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; X 	Bloco :  InnerClasses [ %java/lang/invoke/MethodHandles$Lookup ] java/lang/invoke/MethodHandles Lookup !          ?    @      A   M     *+� *� Y� 	� �    B            C        D E      F   G    F    7   A   �     4� *� �   �  *� � % L+� + � +� 1 � M,� 5���    B          ,  0  3  C     ,  H I    4 D E   J    �  ,�   K L  A   D     *� +� 8 W�    B   
    "  # C        D E      H I  G    H    M L  A   D     *� +� < W�    B   
    &  ' C        D E      H I  G    H    N    O P     Q  W Y   
  Z \ ^ 