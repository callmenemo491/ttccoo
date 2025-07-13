package p221m9;

/* renamed from: m9.s0 */
/* loaded from: classes.dex */
public final class C4488s0 {
    /* renamed from: a */
    public static final java.lang.String m10295a(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length()
            if (r1 >= r2) goto L25
            char r2 = r4.charAt(r1)
            boolean r3 = java.lang.Character.isUpperCase(r2)
            if (r3 == 0) goto L1b
            java.lang.String r3 = "_"
            r0.append(r3)
        L1b:
            char r2 = java.lang.Character.toLowerCase(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L25:
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* renamed from: b */
    public static final void m10296b(java.lang.StringBuilder r6, int r7, java.lang.String r8, java.lang.Object r9) {
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L19
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        La:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r9.next()
            m10296b(r6, r7, r8, r0)
            goto La
        L18:
            return
        L19:
            boolean r0 = r9 instanceof java.util.Map
            if (r0 == 0) goto L38
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L27:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            m10296b(r6, r7, r8, r0)
            goto L27
        L37:
            return
        L38:
            r0 = 10
            r6.append(r0)
            r0 = 0
            r1 = 0
        L3f:
            r2 = 32
            if (r1 >= r7) goto L49
            r6.append(r2)
            int r1 = r1 + 1
            goto L3f
        L49:
            r6.append(r8)
            boolean r8 = r9 instanceof java.lang.String
            r1 = 34
            java.lang.String r3 = ": \""
            if (r8 == 0) goto L71
            r6.append(r3)
            java.lang.String r9 = (java.lang.String) r9
            m9.h r7 = p221m9.AbstractC4454h.f18139Z
            m9.h$f r7 = new m9.h$f
            java.nio.charset.Charset r8 = p221m9.C4505z.f18308a
            byte[] r8 = r9.getBytes(r8)
            r7.<init>(r8)
            java.lang.String r7 = p221m9.C4465k1.m10179a(r7)
        L6a:
            r6.append(r7)
            r6.append(r1)
            goto Ld6
        L71:
            boolean r8 = r9 instanceof p221m9.AbstractC4454h
            if (r8 == 0) goto L7f
            r6.append(r3)
            m9.h r9 = (p221m9.AbstractC4454h) r9
            java.lang.String r7 = p221m9.C4465k1.m10179a(r9)
            goto L6a
        L7f:
            boolean r8 = r9 instanceof p221m9.AbstractC4501x
            java.lang.String r1 = "}"
            java.lang.String r3 = "\n"
            java.lang.String r4 = " {"
            if (r8 == 0) goto La2
            r6.append(r4)
            m9.x r9 = (p221m9.AbstractC4501x) r9
            int r8 = r7 + 2
            m10297c(r9, r6, r8)
            r6.append(r3)
        L96:
            if (r0 >= r7) goto L9e
            r6.append(r2)
            int r0 = r0 + 1
            goto L96
        L9e:
            r6.append(r1)
            goto Ld6
        La2:
            boolean r8 = r9 instanceof java.util.Map.Entry
            if (r8 == 0) goto Lca
            r6.append(r4)
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            int r8 = r7 + 2
            java.lang.Object r4 = r9.getKey()
            java.lang.String r5 = "key"
            m10296b(r6, r8, r5, r4)
            java.lang.Object r9 = r9.getValue()
            java.lang.String r4 = "value"
            m10296b(r6, r8, r4, r9)
            r6.append(r3)
        Lc2:
            if (r0 >= r7) goto L9e
            r6.append(r2)
            int r0 = r0 + 1
            goto Lc2
        Lca:
            java.lang.String r7 = ": "
            r6.append(r7)
            java.lang.String r7 = r9.toString()
            r6.append(r7)
        Ld6:
            return
    }

    /* renamed from: c */
    public static void m10297c(p221m9.InterfaceC4482q0 r13, java.lang.StringBuilder r14, int r15) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L1a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L49
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L46
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L46
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L46:
            int r6 = r6 + 1
            goto L1a
        L49:
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L23c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L65
            java.lang.String r6 = r3.substring(r4)
            goto L66
        L65:
            r6 = r3
        L66:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto Lbe
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto Lbe
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto Lbe
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.substring(r5, r10)
            java.lang.String r9 = r9.toLowerCase()
            r8.append(r9)
            int r9 = r6.length()
            int r9 = r9 + (-4)
            java.lang.String r9 = r6.substring(r10, r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto Lbe
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto Lbe
            java.lang.String r3 = m10295a(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = p221m9.AbstractC4501x.m10368r(r9, r13, r4)
            goto L237
        Lbe:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L121
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L121
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r6.substring(r5, r10)
            java.lang.String r9 = r9.toLowerCase()
            r8.append(r9)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L121
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L121
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L121
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L121
            java.lang.String r4 = m10295a(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = p221m9.AbstractC4501x.m10368r(r3, r13, r6)
            m10296b(r14, r15, r4, r3)
            goto L4d
        L121:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "set"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 != 0) goto L13c
            goto L4d
        L13c:
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L161
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r7)
            int r4 = r6.length()
            int r4 = r4 + (-5)
            java.lang.String r4 = r6.substring(r5, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L161
            goto L4d
        L161:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.substring(r5, r10)
            java.lang.String r4 = r4.toLowerCase()
            r3.append(r4)
            java.lang.String r4 = r6.substring(r10)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "has"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L4d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = p221m9.AbstractC4501x.m10368r(r4, r13, r8)
            if (r6 != 0) goto L225
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L1bf
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ r10
            goto L220
        L1bf:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L1cd
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L21f
            goto L21d
        L1cd:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L1de
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L21f
            goto L21d
        L1de:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L1f0
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L21f
            goto L21d
        L1f0:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L1f7
            java.lang.String r6 = ""
            goto L1fd
        L1f7:
            boolean r6 = r4 instanceof p221m9.AbstractC4454h
            if (r6 == 0) goto L202
            m9.h r6 = p221m9.AbstractC4454h.f18139Z
        L1fd:
            boolean r6 = r4.equals(r6)
            goto L220
        L202:
            boolean r6 = r4 instanceof p221m9.InterfaceC4482q0
            if (r6 == 0) goto L210
            r6 = r4
            m9.q0 r6 = (p221m9.InterfaceC4482q0) r6
            m9.q0 r6 = r6.mo10279b()
            if (r4 != r6) goto L21f
            goto L21d
        L210:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L21f
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L21f
        L21d:
            r6 = 1
            goto L220
        L21f:
            r6 = 0
        L220:
            if (r6 != 0) goto L223
            goto L231
        L223:
            r10 = 0
            goto L231
        L225:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = p221m9.AbstractC4501x.m10368r(r6, r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L231:
            if (r10 == 0) goto L4d
            java.lang.String r3 = m10295a(r3)
        L237:
            m10296b(r14, r15, r3, r4)
            goto L4d
        L23c:
            boolean r0 = r13 instanceof p221m9.AbstractC4501x.c
            if (r0 == 0) goto L268
            r0 = r13
            m9.x$c r0 = (p221m9.AbstractC4501x.c) r0
            m9.t<m9.x$d> r0 = r0.extensions
            java.util.Iterator r0 = r0.m10308k()
        L249:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L268
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            m9.x$d r2 = (p221m9.AbstractC4501x.d) r2
            java.util.Objects.requireNonNull(r2)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = "[0]"
            m10296b(r14, r15, r2, r1)
            goto L249
        L268:
            m9.x r13 = (p221m9.AbstractC4501x) r13
            m9.n1 r13 = r13.unknownFields
            if (r13 == 0) goto L285
        L26e:
            int r0 = r13.f18196a
            if (r5 >= r0) goto L285
            int[] r0 = r13.f18197b
            r0 = r0[r5]
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.f18198c
            r1 = r1[r5]
            m10296b(r14, r15, r0, r1)
            int r5 = r5 + 1
            goto L26e
        L285:
            return
    }
}
