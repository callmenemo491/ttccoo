package p432y9;

/* renamed from: y9.j */
/* loaded from: classes.dex */
public class C7143j {

    /* renamed from: y9.j$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: y9.j$b */
    public static class b {

        /* renamed from: a */
        public final p432y9.C7136c<?> f27583a;

        /* renamed from: b */
        public final java.util.Set<p432y9.C7143j.b> f27584b;

        /* renamed from: c */
        public final java.util.Set<p432y9.C7143j.b> f27585c;

        public b(p432y9.C7136c<?> r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.f27584b = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.f27585c = r0
                r1.f27583a = r2
                return
        }

        /* renamed from: a */
        public boolean m14263a() {
                r1 = this;
                java.util.Set<y9.j$b> r0 = r1.f27585c
                boolean r0 = r0.isEmpty()
                return r0
        }
    }

    /* renamed from: y9.j$c */
    public static class c {

        /* renamed from: a */
        public final java.lang.Class<?> f27586a;

        /* renamed from: b */
        public final boolean f27587b;

        public c(java.lang.Class r1, boolean r2, p432y9.C7143j.a r3) {
                r0 = this;
                r0.<init>()
                r0.f27586a = r1
                r0.f27587b = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof p432y9.C7143j.c
                r1 = 0
                if (r0 == 0) goto L18
                y9.j$c r4 = (p432y9.C7143j.c) r4
                java.lang.Class<?> r0 = r4.f27586a
                java.lang.Class<?> r2 = r3.f27586a
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L18
                boolean r4 = r4.f27587b
                boolean r0 = r3.f27587b
                if (r4 != r0) goto L18
                r1 = 1
            L18:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class<?> r0 = r2.f27586a
                int r0 = r0.hashCode()
                r1 = 1000003(0xf4243, float:1.401303E-39)
                r0 = r0 ^ r1
                int r0 = r0 * r1
                boolean r1 = r2.f27587b
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }
    }

    /* renamed from: a */
    public static void m14262a(java.util.List<p432y9.C7136c<?>> r12) {
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r12.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r12.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r1.next()
            y9.c r2 = (p432y9.C7136c) r2
            y9.j$b r6 = new y9.j$b
            r6.<init>(r2)
            java.util.Set<java.lang.Class<? super T>> r7 = r2.f27559a
            java.util.Iterator r7 = r7.iterator()
        L27:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Ld
            java.lang.Object r8 = r7.next()
            java.lang.Class r8 = (java.lang.Class) r8
            y9.j$c r9 = new y9.j$c
            boolean r10 = r2.m14250b()
            r10 = r10 ^ r5
            r9.<init>(r8, r10, r3)
            boolean r11 = r0.containsKey(r9)
            if (r11 != 0) goto L4b
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            r0.put(r9, r11)
        L4b:
            java.lang.Object r9 = r0.get(r9)
            java.util.Set r9 = (java.util.Set) r9
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L6a
            if (r10 == 0) goto L5a
            goto L6a
        L5a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r8
            java.lang.String r1 = "Multiple components provide %s."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r12.<init>(r0)
            throw r12
        L6a:
            r9.add(r6)
            goto L27
        L6e:
            java.util.Collection r1 = r0.values()
            java.util.Iterator r1 = r1.iterator()
        L76:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ldf
            java.lang.Object r2 = r1.next()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L86:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L76
            java.lang.Object r6 = r2.next()
            y9.j$b r6 = (p432y9.C7143j.b) r6
            y9.c<?> r7 = r6.f27583a
            java.util.Set<y9.k> r7 = r7.f27560b
            java.util.Iterator r7 = r7.iterator()
        L9a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L86
            java.lang.Object r8 = r7.next()
            y9.k r8 = (p432y9.C7144k) r8
            int r9 = r8.f27590c
            if (r9 != 0) goto Lac
            r9 = 1
            goto Lad
        Lac:
            r9 = 0
        Lad:
            if (r9 != 0) goto Lb0
            goto L9a
        Lb0:
            y9.j$c r9 = new y9.j$c
            java.lang.Class<?> r10 = r8.f27588a
            boolean r8 = r8.m14264a()
            r9.<init>(r10, r8, r3)
            java.lang.Object r8 = r0.get(r9)
            java.util.Set r8 = (java.util.Set) r8
            if (r8 != 0) goto Lc4
            goto L9a
        Lc4:
            java.util.Iterator r8 = r8.iterator()
        Lc8:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r8.next()
            y9.j$b r9 = (p432y9.C7143j.b) r9
            java.util.Set<y9.j$b> r10 = r6.f27584b
            r10.add(r9)
            java.util.Set<y9.j$b> r9 = r9.f27585c
            r9.add(r6)
            goto Lc8
        Ldf:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lec:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lfc
            java.lang.Object r2 = r0.next()
            java.util.Set r2 = (java.util.Set) r2
            r1.addAll(r2)
            goto Lec
        Lfc:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r1.iterator()
        L105:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11b
            java.lang.Object r3 = r2.next()
            y9.j$b r3 = (p432y9.C7143j.b) r3
            boolean r5 = r3.m14263a()
            if (r5 == 0) goto L105
            r0.add(r3)
            goto L105
        L11b:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L151
            java.util.Iterator r2 = r0.iterator()
            java.lang.Object r2 = r2.next()
            y9.j$b r2 = (p432y9.C7143j.b) r2
            r0.remove(r2)
            int r4 = r4 + 1
            java.util.Set<y9.j$b> r3 = r2.f27584b
            java.util.Iterator r3 = r3.iterator()
        L136:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L11b
            java.lang.Object r5 = r3.next()
            y9.j$b r5 = (p432y9.C7143j.b) r5
            java.util.Set<y9.j$b> r6 = r5.f27585c
            r6.remove(r2)
            boolean r6 = r5.m14263a()
            if (r6 == 0) goto L136
            r0.add(r5)
            goto L136
        L151:
            int r12 = r12.size()
            if (r4 != r12) goto L158
            return
        L158:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r0 = r1.iterator()
        L161:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L181
            java.lang.Object r1 = r0.next()
            y9.j$b r1 = (p432y9.C7143j.b) r1
            boolean r2 = r1.m14263a()
            if (r2 != 0) goto L161
            java.util.Set<y9.j$b> r2 = r1.f27584b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L161
            y9.c<?> r1 = r1.f27583a
            r12.add(r1)
            goto L161
        L181:
            y9.l r0 = new y9.l
            r0.<init>(r12)
            throw r0
    }
}
