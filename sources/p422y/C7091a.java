package p422y;

/* renamed from: y.a */
/* loaded from: classes.dex */
public class C7091a {

    /* renamed from: a */
    public java.lang.String f27432a;

    /* renamed from: b */
    public int f27433b;

    /* renamed from: c */
    public int f27434c;

    /* renamed from: d */
    public float f27435d;

    /* renamed from: e */
    public java.lang.String f27436e;

    /* renamed from: f */
    public boolean f27437f;

    /* renamed from: g */
    public int f27438g;

    public C7091a(java.lang.String r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.f27432a = r1
            r0.f27433b = r2
            r0.m14205h(r3)
            return
    }

    public C7091a(p422y.C7091a r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.f27432a
            r1.f27432a = r0
            int r2 = r2.f27433b
            r1.f27433b = r2
            r1.m14205h(r3)
            return
    }

    /* renamed from: a */
    public static int m14198a(int r1) {
            int r0 = r1 >> 31
            int r0 = ~r0
            r1 = r1 & r0
            int r1 = r1 + (-255)
            int r0 = r1 >> 31
            r1 = r1 & r0
            int r1 = r1 + 255
            return r1
    }

    /* renamed from: e */
    public static void m14199e(android.content.Context r16, org.xmlpull.v1.XmlPullParser r17, java.util.HashMap<java.lang.String, p422y.C7091a> r18) {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r17)
            int[] r1 = p422y.C7096f.f27458d
            r2 = r16
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r3 = 0
            r4 = 0
            r5 = r4
            r6 = 0
            r7 = 0
        L15:
            if (r6 >= r1) goto Lac
            int r8 = r0.getIndex(r6)
            r9 = 6
            r10 = 7
            r11 = 1
            if (r8 != 0) goto L48
            java.lang.String r4 = r0.getString(r8)
            if (r4 == 0) goto La8
            int r8 = r4.length()
            if (r8 <= 0) goto La8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            char r9 = r4.charAt(r3)
            char r9 = java.lang.Character.toUpperCase(r9)
            r8.append(r9)
            java.lang.String r4 = r4.substring(r11)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            goto La8
        L48:
            if (r8 != r11) goto L54
            boolean r5 = r0.getBoolean(r8, r3)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r7 = 6
            goto La8
        L54:
            r12 = 5
            r13 = 4
            r14 = 2
            r15 = 3
            if (r8 != r15) goto L5c
            r11 = 3
            goto L5f
        L5c:
            if (r8 != r14) goto L64
            r11 = 4
        L5f:
            int r5 = r0.getColor(r8, r3)
            goto L99
        L64:
            r15 = 0
            if (r8 != r10) goto L78
            float r5 = r0.getDimension(r8, r15)
            android.content.res.Resources r7 = r16.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r5 = android.util.TypedValue.applyDimension(r11, r5, r7)
            goto L7e
        L78:
            if (r8 != r13) goto L84
            float r5 = r0.getDimension(r8, r15)
        L7e:
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r7 = 7
            goto La8
        L84:
            if (r8 != r12) goto L92
            r5 = 2143289344(0x7fc00000, float:NaN)
            float r5 = r0.getFloat(r8, r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r7 = 2
            goto La8
        L92:
            if (r8 != r9) goto L9f
            r5 = -1
            int r5 = r0.getInteger(r8, r5)
        L99:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = r11
            goto La8
        L9f:
            r9 = 8
            if (r8 != r9) goto La8
            java.lang.String r5 = r0.getString(r8)
            r7 = 5
        La8:
            int r6 = r6 + 1
            goto L15
        Lac:
            if (r4 == 0) goto Lba
            if (r5 == 0) goto Lba
            y.a r1 = new y.a
            r1.<init>(r4, r7, r5)
            r2 = r18
            r2.put(r4, r1)
        Lba:
            r0.recycle()
            return
    }

    /* renamed from: f */
    public static void m14200f(android.view.View r12, java.util.HashMap<java.lang.String, p422y.C7091a> r13) {
            java.lang.String r0 = "\" not found on "
            java.lang.String r1 = " Custom Attribute \""
            java.lang.String r2 = "TransitionLayout"
            java.lang.Class r3 = r12.getClass()
            java.util.Set r4 = r13.keySet()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L153
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r13.get(r5)
            y.a r6 = (p422y.C7091a) r6
            java.lang.String r7 = "set"
            java.lang.String r7 = p064e.C1493g.m4049a(r7, r5)
            int r8 = r6.f27433b     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            int r8 = p365v.C6480g.m13148b(r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r9 = 0
            r10 = 1
            switch(r8) {
                case 0: goto Lc9;
                case 1: goto Lb0;
                case 2: goto L97;
                case 3: goto L7a;
                case 4: goto L66;
                case 5: goto L4e;
                case 6: goto L36;
                default: goto L35;
            }     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
        L35:
            goto L12
        L36:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Class r11 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            float r6 = r6.f27435d     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            goto L12
        L4e:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            boolean r6 = r6.f27437f     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            goto L12
        L66:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Class<java.lang.CharSequence> r11 = java.lang.CharSequence.class
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.String r6 = r6.f27436e     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            goto L12
        L7a:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Class<android.graphics.drawable.Drawable> r11 = android.graphics.drawable.Drawable.class
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            android.graphics.drawable.ColorDrawable r11 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r11.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            int r6 = r6.f27438g     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r11.setColor(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r6[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8.invoke(r12, r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            goto L12
        L97:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            int r6 = r6.f27438g     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            goto L12
        Lb0:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Class r11 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            float r6 = r6.f27435d     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            goto L12
        Lc9:
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8[r9] = r11     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.reflect.Method r8 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            int r6 = r6.f27434c     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r10[r9] = r6     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            r8.invoke(r12, r10)     // Catch: java.lang.reflect.InvocationTargetException -> Le2 java.lang.IllegalAccessException -> Lfa java.lang.NoSuchMethodException -> L112
            goto L12
        Le2:
            r6 = move-exception
            java.lang.StringBuilder r5 = androidx.activity.result.C0196d.m449a(r1, r5, r0)
            java.lang.String r7 = r3.getName()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            r6.printStackTrace()
            goto L12
        Lfa:
            r6 = move-exception
            java.lang.StringBuilder r5 = androidx.activity.result.C0196d.m449a(r1, r5, r0)
            java.lang.String r7 = r3.getName()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            r6.printStackTrace()
            goto L12
        L112:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            android.util.Log.e(r2, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            r6.append(r0)
            java.lang.String r5 = r3.getName()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.e(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r3.getName()
            r5.append(r6)
            java.lang.String r6 = " must have a method "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            goto L12
        L153:
            return
    }

    /* renamed from: b */
    public float m14201b() {
            r2 = this;
            int r0 = r2.f27433b
            int r0 = p365v.C6480g.m13148b(r0)
            switch(r0) {
                case 0: goto L2b;
                case 1: goto L28;
                case 2: goto L20;
                case 3: goto L20;
                case 4: goto L18;
                case 5: goto Lf;
                case 6: goto Lc;
                default: goto L9;
            }
        L9:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        Lc:
            float r0 = r2.f27435d
            return r0
        Lf:
            boolean r0 = r2.f27437f
            if (r0 == 0) goto L16
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
        L18:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot interpolate String"
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Color does not have a single color to interpolate"
            r0.<init>(r1)
            throw r0
        L28:
            float r0 = r2.f27435d
            return r0
        L2b:
            int r0 = r2.f27434c
            float r0 = (float) r0
            return r0
    }

    /* renamed from: c */
    public void m14202c(float[] r11) {
            r10 = this;
            int r0 = r10.f27433b
            int r0 = p365v.C6480g.m13148b(r0)
            r1 = 0
            switch(r0) {
                case 0: goto L65;
                case 1: goto L60;
                case 2: goto L23;
                case 3: goto L23;
                case 4: goto L1b;
                case 5: goto L10;
                case 6: goto Lb;
                default: goto La;
            }
        La:
            goto L6a
        Lb:
            float r0 = r10.f27435d
            r11[r1] = r0
            goto L6a
        L10:
            boolean r0 = r10.f27437f
            if (r0 == 0) goto L17
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L18
        L17:
            r0 = 0
        L18:
            r11[r1] = r0
            goto L6a
        L1b:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "Color does not have a single color to interpolate"
            r11.<init>(r0)
            throw r11
        L23:
            int r0 = r10.f27438g
            int r2 = r0 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r0 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            r5 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r5
            double r6 = (double) r3
            r8 = 4612136378390124954(0x400199999999999a, double:2.2)
            double r6 = java.lang.Math.pow(r6, r8)
            float r3 = (float) r6
            float r4 = (float) r4
            float r4 = r4 / r5
            double r6 = (double) r4
            double r6 = java.lang.Math.pow(r6, r8)
            float r4 = (float) r6
            float r0 = (float) r0
            float r0 = r0 / r5
            double r6 = (double) r0
            double r6 = java.lang.Math.pow(r6, r8)
            float r0 = (float) r6
            r11[r1] = r3
            r1 = 1
            r11[r1] = r4
            r1 = 2
            r11[r1] = r0
            r0 = 3
            float r1 = (float) r2
            float r1 = r1 / r5
            r11[r0] = r1
            goto L6a
        L60:
            float r0 = r10.f27435d
            r11[r1] = r0
            goto L6a
        L65:
            int r0 = r10.f27434c
            float r0 = (float) r0
            r11[r1] = r0
        L6a:
            return
    }

    /* renamed from: d */
    public int m14203d() {
            r2 = this;
            int r0 = r2.f27433b
            int r0 = p365v.C6480g.m13148b(r0)
            r1 = 2
            if (r0 == r1) goto Le
            r1 = 3
            if (r0 == r1) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 4
            return r0
    }

    /* renamed from: g */
    public void m14204g(android.view.View r17, float[] r18) {
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = "\""
            java.lang.String r4 = "on View \""
            java.lang.String r5 = "TransitionLayout"
            java.lang.Class r0 = r17.getClass()
            java.lang.String r6 = "set"
            java.lang.StringBuilder r6 = android.support.v4.media.C0144c.m256a(r6)
            java.lang.String r7 = r1.f27432a
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            int r7 = r1.f27433b     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r7 = p365v.C6480g.m13148b(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r8 = 2
            r9 = 4601859982876761367(0x3fdd1745d1745d17, double:0.45454545454545453)
            r11 = 1132396544(0x437f0000, float:255.0)
            r12 = 0
            r13 = 1
            switch(r7) {
                case 0: goto L157;
                case 1: goto L13d;
                case 2: goto Le2;
                case 3: goto L85;
                case 4: goto L6c;
                case 5: goto L4b;
                case 6: goto L32;
                default: goto L30;
            }     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
        L30:
            goto L1ae
        L32:
            java.lang.Class[] r7 = new java.lang.Class[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Class r8 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r7[r12] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r8 = r18[r12]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r7[r12] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r0.invoke(r2, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            goto L1ae
        L4b:
            java.lang.Class[] r7 = new java.lang.Class[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r7[r12] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Object[] r7 = new java.lang.Object[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r8 = r18[r12]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r9 = 1056964608(0x3f000000, float:0.5)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L60
            goto L61
        L60:
            r13 = 0
        L61:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r13)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r7[r12] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r0.invoke(r2, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            goto L1ae
        L6c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r7.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.String r8 = "unable to interpolate strings "
            r7.append(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.String r8 = r1.f27432a     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r7.append(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.String r7 = r7.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r0.<init>(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            throw r0     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
        L85:
            java.lang.Class[] r7 = new java.lang.Class[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Class<android.graphics.drawable.Drawable> r14 = android.graphics.drawable.Drawable.class
            r7[r12] = r14     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r7 = r18[r12]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r14 = (double) r7     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r14 = java.lang.Math.pow(r14, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r7 = (float) r14     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r7 = r7 * r11
            int r7 = (int) r7     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r7 = m14198a(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r12 = r18[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r12 = (double) r12     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r12 = java.lang.Math.pow(r12, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r12 = (float) r12     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r12 = r12 * r11
            int r12 = (int) r12     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r12 = m14198a(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r8 = r18[r8]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r13 = (double) r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r8 = java.lang.Math.pow(r13, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r8 = (float) r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r8 = r8 * r11
            int r8 = (int) r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r8 = m14198a(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r9 = 3
            r9 = r18[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r9 = r9 * r11
            int r9 = (int) r9     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r9 = m14198a(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r9 = r9 << 24
            int r7 = r7 << 16
            r7 = r7 | r9
            int r9 = r12 << 8
            r7 = r7 | r9
            r7 = r7 | r8
            android.graphics.drawable.ColorDrawable r8 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r8.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r8.setColor(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r0.invoke(r2, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            goto L1ae
        Le2:
            r7 = 1
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r13 = 0
            r7[r13] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r7 = r18[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r12 = (double) r7     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r12 = java.lang.Math.pow(r12, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r7 = (float) r12     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r7 = r7 * r11
            int r7 = (int) r7     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r7 = m14198a(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r12 = 1
            r12 = r18[r12]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r12 = (double) r12     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r12 = java.lang.Math.pow(r12, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r12 = (float) r12     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r12 = r12 * r11
            int r12 = (int) r12     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r12 = m14198a(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r8 = r18[r8]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r13 = (double) r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            double r8 = java.lang.Math.pow(r13, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r8 = (float) r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r8 = r8 * r11
            int r8 = (int) r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r8 = m14198a(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r9 = 3
            r9 = r18[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            float r9 = r9 * r11
            int r9 = (int) r9     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r9 = m14198a(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r9 = r9 << 24
            int r7 = r7 << 16
            r7 = r7 | r9
            int r9 = r12 << 8
            r7 = r7 | r9
            r7 = r7 | r8
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r9 = 0
            r8[r9] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r0.invoke(r2, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            goto L1ae
        L13d:
            r7 = 1
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Class r9 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r10 = 0
            r8[r10] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r0.getMethod(r6, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r8 = r18[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r7[r10] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r0.invoke(r2, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            goto L1ae
        L157:
            r7 = 1
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r10 = 0
            r8[r10] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.reflect.Method r0 = r0.getMethod(r6, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r8 = r18[r10]     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            int r8 = (int) r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r7[r10] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            r0.invoke(r2, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L172 java.lang.IllegalAccessException -> L177 java.lang.NoSuchMethodException -> L193
            goto L1ae
        L172:
            r0 = move-exception
            r0.printStackTrace()
            goto L1ae
        L177:
            r0 = move-exception
            java.lang.String r7 = "cannot access method "
            java.lang.StringBuilder r4 = androidx.activity.result.C0196d.m449a(r7, r6, r4)
            java.lang.String r2 = p346u.C6256a.m12872c(r17)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            android.util.Log.e(r5, r2)
            r0.printStackTrace()
            goto L1ae
        L193:
            r0 = move-exception
            java.lang.String r7 = "no method "
            java.lang.StringBuilder r4 = androidx.activity.result.C0196d.m449a(r7, r6, r4)
            java.lang.String r2 = p346u.C6256a.m12872c(r17)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            android.util.Log.e(r5, r2)
            r0.printStackTrace()
        L1ae:
            return
    }

    /* renamed from: h */
    public void m14205h(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f27433b
            int r0 = p365v.C6480g.m13148b(r0)
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L21;
                case 2: goto L18;
                case 3: goto L18;
                case 4: goto L13;
                case 5: goto La;
                case 6: goto L21;
                default: goto L9;
            }
        L9:
            goto L32
        La:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r1.f27437f = r2
            goto L32
        L13:
            java.lang.String r2 = (java.lang.String) r2
            r1.f27436e = r2
            goto L32
        L18:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.f27438g = r2
            goto L32
        L21:
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.f27435d = r2
            goto L32
        L2a:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.f27434c = r2
        L32:
            return
    }
}
