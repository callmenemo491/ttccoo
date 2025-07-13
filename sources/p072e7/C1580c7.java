package p072e7;

/* renamed from: e7.c7 */
/* loaded from: classes.dex */
public final class C1580c7 {
    /* renamed from: a */
    public static final void m4144a(java.lang.StringBuilder r6, int r7, java.lang.String r8, java.lang.Object r9) {
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L19
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        La:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r9.next()
            m4144a(r6, r7, r8, r0)
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
            m4144a(r6, r7, r8, r0)
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
            e7.i5 r7 = p072e7.AbstractC1638i5.f7635Z
            e7.h5 r7 = new e7.h5
            java.nio.charset.Charset r8 = p072e7.C1619g6.f7568a
            byte[] r8 = r9.getBytes(r8)
            r7.<init>(r8)
            java.lang.String r7 = p052d6.C1310h0.m3802d(r7)
            r6.append(r7)
            r6.append(r1)
            return
        L71:
            boolean r8 = r9 instanceof p072e7.AbstractC1638i5
            if (r8 == 0) goto L85
            r6.append(r3)
            e7.i5 r9 = (p072e7.AbstractC1638i5) r9
            java.lang.String r7 = p052d6.C1310h0.m3802d(r9)
            r6.append(r7)
            r6.append(r1)
            return
        L85:
            boolean r8 = r9 instanceof p072e7.AbstractC1783x5
            java.lang.String r1 = "}"
            java.lang.String r3 = "\n"
            java.lang.String r4 = " {"
            if (r8 == 0) goto La8
            r6.append(r4)
            e7.x5 r9 = (p072e7.AbstractC1783x5) r9
            int r8 = r7 + 2
            m4146c(r9, r6, r8)
            r6.append(r3)
        L9c:
            if (r0 >= r7) goto La4
            r6.append(r2)
            int r0 = r0 + 1
            goto L9c
        La4:
            r6.append(r1)
            return
        La8:
            boolean r8 = r9 instanceof java.util.Map.Entry
            if (r8 == 0) goto Ld4
            r6.append(r4)
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            int r8 = r7 + 2
            java.lang.Object r4 = r9.getKey()
            java.lang.String r5 = "key"
            m4144a(r6, r8, r5, r4)
            java.lang.Object r9 = r9.getValue()
            java.lang.String r4 = "value"
            m4144a(r6, r8, r4, r9)
            r6.append(r3)
        Lc8:
            if (r0 >= r7) goto Ld0
            r6.append(r2)
            int r0 = r0 + 1
            goto Lc8
        Ld0:
            r6.append(r1)
            return
        Ld4:
            java.lang.String r7 = ": "
            r6.append(r7)
            java.lang.String r7 = r9.toString()
            r6.append(r7)
            return
    }

    /* renamed from: b */
    public static final java.lang.String m4145b(java.lang.String r4) {
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

    /* renamed from: c */
    public static void m4146c(p072e7.InterfaceC1560a7 r12, java.lang.StringBuilder r13, int r14) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r12.getClass()
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
            if (r3 == 0) goto L269
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r3.startsWith(r7)
            if (r4 == 0) goto L65
            r4 = 3
            java.lang.String r4 = r3.substring(r4)
            goto L66
        L65:
            r4 = r3
        L66:
            java.lang.String r6 = "List"
            boolean r8 = r4.endsWith(r6)
            r9 = 1
            if (r8 == 0) goto Lca
            java.lang.String r8 = "OrBuilderList"
            boolean r8 = r4.endsWith(r8)
            if (r8 != 0) goto Lca
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto Lca
            java.lang.String r6 = r4.substring(r5, r9)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r4.length()
            int r8 = r8 + (-4)
            java.lang.String r8 = r4.substring(r9, r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r10 = r8.length()
            if (r10 == 0) goto La2
            java.lang.String r6 = r6.concat(r8)
            goto La8
        La2:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r6)
            r6 = r8
        La8:
            java.lang.Object r8 = r0.get(r3)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 == 0) goto Lca
            java.lang.Class r10 = r8.getReturnType()
            java.lang.Class<java.util.List> r11 = java.util.List.class
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto Lca
            java.lang.String r3 = m4145b(r6)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = p072e7.AbstractC1783x5.m4488h(r8, r12, r4)
            m4144a(r13, r14, r3, r4)
            goto L4d
        Lca:
            java.lang.String r6 = "Map"
            boolean r8 = r4.endsWith(r6)
            if (r8 == 0) goto L138
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L138
            java.lang.String r6 = r4.substring(r5, r9)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r4.length()
            int r8 = r8 + (-3)
            java.lang.String r8 = r4.substring(r9, r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r10 = r8.length()
            if (r10 == 0) goto Lfd
            java.lang.String r6 = r6.concat(r8)
            goto L103
        Lfd:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r6)
            r6 = r8
        L103:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L138
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L138
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L138
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L138
            java.lang.String r4 = m4145b(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = p072e7.AbstractC1783x5.m4488h(r3, r12, r6)
            m4144a(r13, r14, r4, r3)
            goto L4d
        L138:
            java.lang.String r3 = "set"
            int r6 = r4.length()
            if (r6 == 0) goto L145
            java.lang.String r3 = r3.concat(r4)
            goto L14b
        L145:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3)
            r3 = r6
        L14b:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L4d
            java.lang.String r3 = "Bytes"
            boolean r3 = r4.endsWith(r3)
            if (r3 == 0) goto L17f
            int r3 = r4.length()
            int r3 = r3 + (-5)
            java.lang.String r3 = r4.substring(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L174
            java.lang.String r3 = r7.concat(r3)
            goto L179
        L174:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L179:
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L4d
        L17f:
            java.lang.String r3 = r4.substring(r5, r9)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = r4.substring(r9)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r6.length()
            if (r8 == 0) goto L19e
            java.lang.String r3 = r3.concat(r6)
            goto L1a4
        L19e:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3)
            r3 = r6
        L1a4:
            int r6 = r4.length()
            if (r6 == 0) goto L1af
            java.lang.String r6 = r7.concat(r4)
            goto L1b4
        L1af:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L1b4:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r8 = "has"
            int r9 = r4.length()
            if (r9 == 0) goto L1c7
            java.lang.String r4 = r8.concat(r4)
            goto L1cc
        L1c7:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
        L1cc:
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r6 == 0) goto L4d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = p072e7.AbstractC1783x5.m4488h(r6, r12, r8)
            if (r4 != 0) goto L252
            boolean r4 = r6 instanceof java.lang.Boolean
            if (r4 == 0) goto L1eb
            r4 = r6
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4d
            goto L260
        L1eb:
            boolean r4 = r6 instanceof java.lang.Integer
            if (r4 == 0) goto L1fa
            r4 = r6
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == 0) goto L4d
            goto L260
        L1fa:
            boolean r4 = r6 instanceof java.lang.Float
            if (r4 == 0) goto L20c
            r4 = r6
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            if (r4 == 0) goto L4d
            goto L260
        L20c:
            boolean r4 = r6 instanceof java.lang.Double
            if (r4 == 0) goto L222
            r4 = r6
            java.lang.Double r4 = (java.lang.Double) r4
            double r8 = r4.doubleValue()
            long r8 = java.lang.Double.doubleToRawLongBits(r8)
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 == 0) goto L4d
            goto L260
        L222:
            boolean r4 = r6 instanceof java.lang.String
            if (r4 == 0) goto L229
            java.lang.String r4 = ""
            goto L22f
        L229:
            boolean r4 = r6 instanceof p072e7.AbstractC1638i5
            if (r4 == 0) goto L236
            e7.i5 r4 = p072e7.AbstractC1638i5.f7635Z
        L22f:
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L4d
            goto L260
        L236:
            boolean r4 = r6 instanceof p072e7.InterfaceC1560a7
            if (r4 == 0) goto L244
            r4 = r6
            e7.a7 r4 = (p072e7.InterfaceC1560a7) r4
            e7.a7 r4 = r4.mo4130k()
            if (r6 == r4) goto L4d
            goto L260
        L244:
            boolean r4 = r6 instanceof java.lang.Enum
            if (r4 == 0) goto L260
            r4 = r6
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r4 = r4.ordinal()
            if (r4 == 0) goto L4d
            goto L260
        L252:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = p072e7.AbstractC1783x5.m4488h(r4, r12, r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L4d
        L260:
            java.lang.String r3 = m4145b(r3)
            m4144a(r13, r14, r3, r6)
            goto L4d
        L269:
            boolean r13 = r12 instanceof p072e7.AbstractC1774w5
            if (r13 != 0) goto L270
            e7.x5 r12 = (p072e7.AbstractC1783x5) r12
            return
        L270:
            e7.w5 r12 = (p072e7.AbstractC1774w5) r12
            r12 = 0
            throw r12
    }
}
