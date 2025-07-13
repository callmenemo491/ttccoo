package androidx.fragment.app;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public class C0371c extends androidx.fragment.app.AbstractC0370b1 {

    /* renamed from: androidx.fragment.app.c$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ java.util.List f2083Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.AbstractC0370b1.d f2084Z;

        /* renamed from: a0 */
        public final /* synthetic */ androidx.fragment.app.C0371c f2085a0;

        public a(androidx.fragment.app.C0371c r1, java.util.List r2, androidx.fragment.app.AbstractC0370b1.d r3) {
                r0 = this;
                r0.f2085a0 = r1
                r0.f2083Y = r2
                r0.f2084Z = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.List r0 = r2.f2083Y
                androidx.fragment.app.b1$d r1 = r2.f2084Z
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L21
                java.util.List r0 = r2.f2083Y
                androidx.fragment.app.b1$d r1 = r2.f2084Z
                r0.remove(r1)
                androidx.fragment.app.c r0 = r2.f2085a0
                androidx.fragment.app.b1$d r1 = r2.f2084Z
                java.util.Objects.requireNonNull(r0)
                androidx.fragment.app.n r0 = r1.f2068c
                android.view.View r0 = r0.f2260C0
                androidx.fragment.app.b1$d$c r1 = r1.f2066a
                r1.m1109e(r0)
            L21:
                return
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    public static class b extends androidx.fragment.app.C0371c.c {

        /* renamed from: c */
        public boolean f2086c;

        /* renamed from: d */
        public boolean f2087d;

        /* renamed from: e */
        public androidx.fragment.app.C0413w.a f2088e;

        public b(androidx.fragment.app.AbstractC0370b1.d r1, p158j0.C3380b r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.f2087d = r1
                r0.f2086c = r3
                return
        }

        /* renamed from: c */
        public androidx.fragment.app.C0413w.a m1113c(android.content.Context r5) {
                r4 = this;
                boolean r0 = r4.f2087d
                if (r0 == 0) goto L7
                androidx.fragment.app.w$a r5 = r4.f2088e
                return r5
            L7:
                androidx.fragment.app.b1$d r0 = r4.f2089a
                androidx.fragment.app.n r1 = r0.f2068c
                androidx.fragment.app.b1$d$c r0 = r0.f2066a
                androidx.fragment.app.b1$d$c r2 = androidx.fragment.app.AbstractC0370b1.d.c.f2079Z
                r3 = 1
                if (r0 != r2) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                boolean r2 = r4.f2086c
                androidx.fragment.app.w$a r5 = androidx.fragment.app.C0413w.m1398a(r5, r1, r0, r2)
                r4.f2088e = r5
                r4.f2087d = r3
                return r5
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    public static class c {

        /* renamed from: a */
        public final androidx.fragment.app.AbstractC0370b1.d f2089a;

        /* renamed from: b */
        public final p158j0.C3380b f2090b;

        public c(androidx.fragment.app.AbstractC0370b1.d r1, p158j0.C3380b r2) {
                r0 = this;
                r0.<init>()
                r0.f2089a = r1
                r0.f2090b = r2
                return
        }

        /* renamed from: a */
        public void m1114a() {
                r3 = this;
                androidx.fragment.app.b1$d r0 = r3.f2089a
                j0.b r1 = r3.f2090b
                java.util.HashSet<j0.b> r2 = r0.f2070e
                boolean r1 = r2.remove(r1)
                if (r1 == 0) goto L17
                java.util.HashSet<j0.b> r1 = r0.f2070e
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L17
                r0.mo1102b()
            L17:
                return
        }

        /* renamed from: b */
        public boolean m1115b() {
                r3 = this;
                androidx.fragment.app.b1$d r0 = r3.f2089a
                androidx.fragment.app.n r0 = r0.f2068c
                android.view.View r0 = r0.f2260C0
                androidx.fragment.app.b1$d$c r0 = androidx.fragment.app.AbstractC0370b1.d.c.m1108h(r0)
                androidx.fragment.app.b1$d r1 = r3.f2089a
                androidx.fragment.app.b1$d$c r1 = r1.f2066a
                if (r0 == r1) goto L19
                androidx.fragment.app.b1$d$c r2 = androidx.fragment.app.AbstractC0370b1.d.c.f2079Z
                if (r0 == r2) goto L17
                if (r1 == r2) goto L17
                goto L19
            L17:
                r0 = 0
                goto L1a
            L19:
                r0 = 1
            L1a:
                return r0
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    public static class d extends androidx.fragment.app.C0371c.c {

        /* renamed from: c */
        public final java.lang.Object f2091c;

        /* renamed from: d */
        public final boolean f2092d;

        /* renamed from: e */
        public final java.lang.Object f2093e;

        public d(androidx.fragment.app.AbstractC0370b1.d r3, p158j0.C3380b r4, boolean r5, boolean r6) {
                r2 = this;
                r2.<init>(r3, r4)
                androidx.fragment.app.b1$d$c r4 = r3.f2066a
                androidx.fragment.app.b1$d$c r0 = androidx.fragment.app.AbstractC0370b1.d.c.f2079Z
                r1 = 0
                if (r4 != r0) goto L27
                if (r5 == 0) goto L13
                androidx.fragment.app.n r4 = r3.f2068c
                java.lang.Object r4 = r4.m1304H()
                goto L19
            L13:
                androidx.fragment.app.n r4 = r3.f2068c
                r4.m1343x()
                r4 = r1
            L19:
                r2.f2091c = r4
                if (r5 == 0) goto L22
                androidx.fragment.app.n r4 = r3.f2068c
                androidx.fragment.app.n$d r4 = r4.f2263F0
                goto L38
            L22:
                androidx.fragment.app.n r4 = r3.f2068c
                androidx.fragment.app.n$d r4 = r4.f2263F0
                goto L38
            L27:
                if (r5 == 0) goto L30
                androidx.fragment.app.n r4 = r3.f2068c
                java.lang.Object r4 = r4.m1306J()
                goto L36
            L30:
                androidx.fragment.app.n r4 = r3.f2068c
                r4.m1294A()
                r4 = r1
            L36:
                r2.f2091c = r4
            L38:
                r4 = 1
                r2.f2092d = r4
                if (r6 == 0) goto L4d
                if (r5 == 0) goto L48
                androidx.fragment.app.n r3 = r3.f2068c
                java.lang.Object r3 = r3.m1308L()
                r2.f2093e = r3
                goto L4f
            L48:
                androidx.fragment.app.n r3 = r3.f2068c
                r3.m1307K()
            L4d:
                r2.f2093e = r1
            L4f:
                return
        }

        /* renamed from: c */
        public final androidx.fragment.app.AbstractC0412v0 m1116c(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r4 = 0
                return r4
            L4:
                androidx.fragment.app.v0 r0 = androidx.fragment.app.C0408t0.f2374b
                boolean r1 = r4 instanceof android.transition.Transition
                if (r1 == 0) goto Lb
                return r0
            Lb:
                androidx.fragment.app.v0 r0 = androidx.fragment.app.C0408t0.f2375c
                if (r0 == 0) goto L16
                boolean r1 = r0.mo1376e(r4)
                if (r1 == 0) goto L16
                return r0
            L16:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Transition "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " for fragment "
                r1.append(r4)
                androidx.fragment.app.b1$d r4 = r3.f2089a
                androidx.fragment.app.n r4 = r4.f2068c
                r1.append(r4)
                java.lang.String r4 = " is not a valid framework Transition or AndroidX Transition"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    public C0371c(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.fragment.app.AbstractC0370b1
    /* renamed from: b */
    public void mo1096b(java.util.List<androidx.fragment.app.AbstractC0370b1.d> r40, boolean r41) {
            r39 = this;
            r7 = r39
            r6 = r41
            androidx.fragment.app.b1$d$c r8 = androidx.fragment.app.AbstractC0370b1.d.c.f2080a0
            androidx.fragment.app.b1$d$c r9 = androidx.fragment.app.AbstractC0370b1.d.c.f2079Z
            java.util.Iterator r0 = r40.iterator()
            r1 = 0
            r2 = 0
            r10 = r1
            r11 = r2
        L10:
            boolean r1 = r0.hasNext()
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b1$d r1 = (androidx.fragment.app.AbstractC0370b1.d) r1
            androidx.fragment.app.n r4 = r1.f2068c
            android.view.View r4 = r4.f2260C0
            androidx.fragment.app.b1$d$c r4 = androidx.fragment.app.AbstractC0370b1.d.c.m1108h(r4)
            androidx.fragment.app.b1$d$c r5 = r1.f2066a
            int r5 = r5.ordinal()
            if (r5 == 0) goto L3a
            if (r5 == r3) goto L36
            if (r5 == r2) goto L3a
            r2 = 3
            if (r5 == r2) goto L3a
            goto L10
        L36:
            if (r4 == r9) goto L10
            r11 = r1
            goto L10
        L3a:
            if (r4 != r9) goto L10
            if (r10 != 0) goto L10
            r10 = r1
            goto L10
        L40:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = r40
            r14.<init>(r0)
            java.util.Iterator r0 = r40.iterator()
        L55:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La0
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b1$d r1 = (androidx.fragment.app.AbstractC0370b1.d) r1
            j0.b r2 = new j0.b
            r2.<init>()
            r1.mo1103d()
            java.util.HashSet<j0.b> r3 = r1.f2070e
            r3.add(r2)
            androidx.fragment.app.c$b r3 = new androidx.fragment.app.c$b
            r3.<init>(r1, r2, r6)
            r12.add(r3)
            j0.b r2 = new j0.b
            r2.<init>()
            r1.mo1103d()
            java.util.HashSet<j0.b> r3 = r1.f2070e
            r3.add(r2)
            androidx.fragment.app.c$d r3 = new androidx.fragment.app.c$d
            if (r6 == 0) goto L8a
            if (r1 != r10) goto L8e
            goto L8c
        L8a:
            if (r1 != r11) goto L8e
        L8c:
            r4 = 1
            goto L8f
        L8e:
            r4 = 0
        L8f:
            r3.<init>(r1, r2, r6, r4)
            r13.add(r3)
            androidx.fragment.app.c$a r2 = new androidx.fragment.app.c$a
            r2.<init>(r7, r14, r1)
            java.util.List<java.lang.Runnable> r1 = r1.f2069d
            r1.add(r2)
            goto L55
        La0:
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            java.util.Iterator r0 = r13.iterator()
            r1 = 0
            r5 = r1
        Lab:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L12b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.c$d r1 = (androidx.fragment.app.C0371c.d) r1
            boolean r2 = r1.m1115b()
            if (r2 == 0) goto Lbe
            goto Lab
        Lbe:
            java.lang.Object r2 = r1.f2091c
            androidx.fragment.app.v0 r2 = r1.m1116c(r2)
            java.lang.Object r3 = r1.f2093e
            androidx.fragment.app.v0 r3 = r1.m1116c(r3)
            java.lang.String r4 = " returned Transition "
            java.lang.String r16 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r2 == 0) goto Lfc
            if (r3 == 0) goto Lfc
            if (r2 != r3) goto Ld5
            goto Lfc
        Ld5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r16)
            androidx.fragment.app.b1$d r3 = r1.f2089a
            androidx.fragment.app.n r3 = r3.f2068c
            r2.append(r3)
            r2.append(r4)
            java.lang.Object r3 = r1.f2091c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            java.lang.Object r1 = r1.f2093e
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Lfc:
            if (r2 == 0) goto Lff
            goto L100
        Lff:
            r2 = r3
        L100:
            if (r5 != 0) goto L104
            r5 = r2
            goto Lab
        L104:
            if (r2 == 0) goto Lab
            if (r5 != r2) goto L109
            goto Lab
        L109:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r16)
            androidx.fragment.app.b1$d r3 = r1.f2089a
            androidx.fragment.app.n r3 = r3.f2068c
            r2.append(r3)
            r2.append(r4)
            java.lang.Object r1 = r1.f2091c
            r2.append(r1)
            java.lang.String r1 = " which uses a different Transition  type than other Fragments."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L12b:
            java.lang.String r4 = "FragmentManager"
            if (r5 != 0) goto L153
            java.util.Iterator r0 = r13.iterator()
        L133:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.c$d r1 = (androidx.fragment.app.C0371c.d) r1
            androidx.fragment.app.b1$d r2 = r1.f2089a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r15.put(r2, r3)
            r1.m1114a()
            goto L133
        L14a:
            r10 = r8
            r24 = r12
            r29 = r14
            r8 = r15
            r12 = r4
            goto L55a
        L153:
            android.view.View r3 = new android.view.View
            android.view.ViewGroup r0 = r7.f2056a
            android.content.Context r0 = r0.getContext()
            r3.<init>(r0)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r24 = r12
            s.a r12 = new s.a
            r12.<init>()
            java.util.Iterator r25 = r13.iterator()
            r16 = 0
            r17 = 0
            r18 = 0
            r40 = r2
            r2 = r16
            r26 = r17
            r27 = 0
            r16 = r3
            r17 = r4
            r3 = r10
            r4 = r11
        L18c:
            boolean r18 = r25.hasNext()
            if (r18 == 0) goto L387
            java.lang.Object r18 = r25.next()
            r28 = r9
            r9 = r18
            androidx.fragment.app.c$d r9 = (androidx.fragment.app.C0371c.d) r9
            java.lang.Object r9 = r9.f2093e
            if (r9 == 0) goto L1a3
            r18 = 1
            goto L1a5
        L1a3:
            r18 = 0
        L1a5:
            if (r18 == 0) goto L35b
            if (r3 == 0) goto L35b
            if (r4 == 0) goto L35b
            java.lang.Object r2 = r5.mo1377g(r9)
            java.lang.Object r9 = r5.mo1389y(r2)
            androidx.fragment.app.n r2 = r4.f2068c
            androidx.fragment.app.n$d r2 = r2.f2263F0
            if (r2 == 0) goto L1bd
            java.util.ArrayList<java.lang.String> r2 = r2.f2315i
            if (r2 != 0) goto L1c2
        L1bd:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L1c2:
            r18 = r5
            androidx.fragment.app.n r5 = r3.f2068c
            androidx.fragment.app.n$d r5 = r5.f2263F0
            if (r5 == 0) goto L1ce
            java.util.ArrayList<java.lang.String> r5 = r5.f2315i
            if (r5 != 0) goto L1d3
        L1ce:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L1d3:
            r29 = r14
            androidx.fragment.app.n r14 = r3.f2068c
            androidx.fragment.app.n$d r14 = r14.f2263F0
            if (r14 == 0) goto L1df
            java.util.ArrayList<java.lang.String> r14 = r14.f2316j
            if (r14 != 0) goto L1e4
        L1df:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L1e4:
            r19 = 0
            r30 = r8
            r31 = r13
            r8 = 0
        L1eb:
            int r13 = r14.size()
            if (r8 >= r13) goto L20a
            java.lang.Object r13 = r14.get(r8)
            int r13 = r2.indexOf(r13)
            r19 = r14
            r14 = -1
            if (r13 == r14) goto L205
            java.lang.Object r14 = r5.get(r8)
            r2.set(r13, r14)
        L205:
            int r8 = r8 + 1
            r14 = r19
            goto L1eb
        L20a:
            androidx.fragment.app.n r5 = r4.f2068c
            androidx.fragment.app.n$d r5 = r5.f2263F0
            if (r5 == 0) goto L214
            java.util.ArrayList<java.lang.String> r5 = r5.f2316j
            if (r5 != 0) goto L219
        L214:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L219:
            r8 = r5
            if (r6 != 0) goto L227
            androidx.fragment.app.n r5 = r3.f2068c
            r5.m1296B()
            androidx.fragment.app.n r5 = r4.f2068c
            r5.m1345y()
            goto L231
        L227:
            androidx.fragment.app.n r5 = r3.f2068c
            r5.m1345y()
            androidx.fragment.app.n r5 = r4.f2068c
            r5.m1296B()
        L231:
            int r5 = r2.size()
            r13 = 0
        L236:
            if (r13 >= r5) goto L250
            java.lang.Object r14 = r2.get(r13)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r19 = r8.get(r13)
            r20 = r5
            r5 = r19
            java.lang.String r5 = (java.lang.String) r5
            r12.put(r14, r5)
            int r13 = r13 + 1
            r5 = r20
            goto L236
        L250:
            s.a r13 = new s.a
            r13.<init>()
            androidx.fragment.app.n r5 = r3.f2068c
            android.view.View r5 = r5.f2260C0
            r7.m1111k(r13, r5)
            p319s.AbstractC5940g.m12333k(r13, r2)
            java.util.Set r5 = r13.keySet()
            p319s.AbstractC5940g.m12333k(r12, r5)
            s.a r14 = new s.a
            r14.<init>()
            androidx.fragment.app.n r5 = r4.f2068c
            android.view.View r5 = r5.f2260C0
            r7.m1111k(r14, r5)
            p319s.AbstractC5940g.m12333k(r14, r8)
            java.util.Collection r5 = r12.values()
            p319s.AbstractC5940g.m12333k(r14, r5)
            androidx.fragment.app.C0408t0.m1368m(r12, r14)
            java.util.Set r5 = r12.keySet()
            r7.m1112l(r13, r5)
            java.util.Collection r5 = r12.values()
            r7.m1112l(r14, r5)
            boolean r5 = r12.isEmpty()
            if (r5 == 0) goto L2aa
            r1.clear()
            r0.clear()
            r2 = 0
            r5 = r40
            r6 = r1
            r32 = r12
            r8 = r15
            r35 = r17
            r15 = r0
            r12 = r11
            r0 = r16
            r11 = r18
            goto L36e
        L2aa:
            androidx.fragment.app.n r4 = r4.f2068c
            androidx.fragment.app.n r3 = r3.f2068c
            r5 = 1
            androidx.fragment.app.C0408t0.m1358c(r4, r3, r6, r13, r5)
            android.view.ViewGroup r5 = r7.f2056a
            androidx.fragment.app.h r4 = new androidx.fragment.app.h
            r3 = r0
            r0 = r4
            r6 = r1
            r1 = r39
            r32 = r12
            r12 = r40
            r40 = r2
            r2 = r11
            r33 = r11
            r34 = r15
            r11 = r16
            r15 = r3
            r3 = r10
            r36 = r10
            r35 = r17
            r10 = r4
            r4 = r41
            r37 = r11
            r38 = r12
            r11 = r18
            r12 = r5
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r12, r10)
            java.util.Collection r0 = r13.values()
            r6.addAll(r0)
            boolean r0 = r40.isEmpty()
            if (r0 != 0) goto L301
            r0 = 0
            r2 = r40
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r13.get(r1)
            android.view.View r1 = (android.view.View) r1
            r11.mo1385t(r9, r1)
            r26 = r1
            goto L302
        L301:
            r0 = 0
        L302:
            java.util.Collection r1 = r14.values()
            r15.addAll(r1)
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L32f
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r14.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L32f
            android.view.ViewGroup r1 = r7.f2056a
            androidx.fragment.app.i r2 = new androidx.fragment.app.i
            r5 = r38
            r2.<init>(r7, r11, r0, r5)
            p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r1, r2)
            r0 = 1
            r0 = r37
            r27 = 1
            goto L333
        L32f:
            r5 = r38
            r0 = r37
        L333:
            r11.mo1387w(r9, r0, r6)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r11
            r17 = r9
            r22 = r9
            r23 = r15
            r16.mo1383r(r17, r18, r19, r20, r21, r22, r23)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r8 = r34
            r10 = r36
            r8.put(r10, r1)
            r12 = r33
            r8.put(r12, r1)
            r2 = r9
            r3 = r10
            r4 = r12
            goto L36e
        L35b:
            r6 = r1
            r30 = r8
            r32 = r12
            r31 = r13
            r29 = r14
            r8 = r15
            r35 = r17
            r15 = r0
            r12 = r11
            r0 = r16
            r11 = r5
            r5 = r40
        L36e:
            r16 = r0
            r40 = r5
            r1 = r6
            r5 = r11
            r11 = r12
            r0 = r15
            r9 = r28
            r14 = r29
            r13 = r31
            r12 = r32
            r17 = r35
            r6 = r41
            r15 = r8
            r8 = r30
            goto L18c
        L387:
            r6 = r1
            r30 = r8
            r28 = r9
            r32 = r12
            r31 = r13
            r29 = r14
            r8 = r15
            r35 = r17
            r15 = r0
            r12 = r11
            r0 = r16
            r11 = r5
            r5 = r40
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r31.iterator()
            r10 = 0
            r13 = 0
        L3a7:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L4a6
            java.lang.Object r14 = r9.next()
            androidx.fragment.app.c$d r14 = (androidx.fragment.app.C0371c.d) r14
            boolean r16 = r14.m1115b()
            if (r16 == 0) goto L3d5
            r40 = r9
            androidx.fragment.app.b1$d r9 = r14.f2089a
            r33 = r12
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r8.put(r9, r12)
            r14.m1114a()
            r16 = r0
            r25 = r2
            r2 = r4
            r9 = r10
            r0 = r26
            r4 = r28
            r10 = r30
            goto L494
        L3d5:
            r40 = r9
            r33 = r12
            java.lang.Object r9 = r14.f2091c
            java.lang.Object r9 = r11.mo1377g(r9)
            androidx.fragment.app.b1$d r12 = r14.f2089a
            if (r2 == 0) goto L3e9
            if (r12 == r3) goto L3e7
            if (r12 != r4) goto L3e9
        L3e7:
            r4 = 1
            goto L3ea
        L3e9:
            r4 = 0
        L3ea:
            if (r9 != 0) goto L403
            if (r4 != 0) goto L3f6
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r8.put(r12, r4)
            r14.m1114a()
        L3f6:
            r16 = r0
            r25 = r2
            r2 = r10
            r0 = r26
            r4 = r28
            r10 = r30
            goto L491
        L403:
            r25 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r34 = r10
            androidx.fragment.app.n r10 = r12.f2068c
            android.view.View r10 = r10.f2260C0
            r7.m1110j(r2, r10)
            if (r4 == 0) goto L41e
            if (r12 != r3) goto L41b
            r2.removeAll(r6)
            goto L41e
        L41b:
            r2.removeAll(r15)
        L41e:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L42c
            r11.mo1373a(r9, r0)
            r16 = r0
            r10 = r30
            goto L463
        L42c:
            r11.mo1374b(r9, r2)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r16 = r11
            r17 = r9
            r18 = r9
            r19 = r2
            r16.mo1383r(r17, r18, r19, r20, r21, r22, r23)
            androidx.fragment.app.b1$d$c r4 = r12.f2066a
            r10 = r30
            if (r4 != r10) goto L461
            r4 = r29
            r4.remove(r12)
            r16 = r0
            androidx.fragment.app.n r0 = r12.f2068c
            android.view.View r0 = r0.f2260C0
            r11.mo1382q(r9, r0, r2)
            android.view.ViewGroup r0 = r7.f2056a
            androidx.fragment.app.j r4 = new androidx.fragment.app.j
            r4.<init>(r7, r2)
            p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r0, r4)
            goto L463
        L461:
            r16 = r0
        L463:
            androidx.fragment.app.b1$d$c r0 = r12.f2066a
            r4 = r28
            if (r0 != r4) goto L474
            r1.addAll(r2)
            if (r27 == 0) goto L471
            r11.mo1384s(r9, r5)
        L471:
            r0 = r26
            goto L479
        L474:
            r0 = r26
            r11.mo1385t(r9, r0)
        L479:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r8.put(r12, r2)
            boolean r2 = r14.f2092d
            if (r2 == 0) goto L48a
            r2 = 0
            java.lang.Object r13 = r11.mo1379m(r13, r9, r2)
            r2 = r34
            goto L491
        L48a:
            r2 = 0
            r12 = r34
            java.lang.Object r2 = r11.mo1379m(r12, r9, r2)
        L491:
            r9 = r2
            r2 = r33
        L494:
            r26 = r0
            r28 = r4
            r30 = r10
            r0 = r16
            r12 = r33
            r4 = r2
            r10 = r9
            r2 = r25
            r9 = r40
            goto L3a7
        L4a6:
            r33 = r12
            r12 = r10
            r10 = r30
            java.lang.Object r0 = r11.mo1378l(r13, r12, r2)
            java.util.Iterator r4 = r31.iterator()
        L4b3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L52a
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.c$d r5 = (androidx.fragment.app.C0371c.d) r5
            boolean r9 = r5.m1115b()
            if (r9 == 0) goto L4c6
            goto L4b3
        L4c6:
            java.lang.Object r9 = r5.f2091c
            androidx.fragment.app.b1$d r12 = r5.f2089a
            r13 = r33
            if (r2 == 0) goto L4d4
            if (r12 == r3) goto L4d2
            if (r12 != r13) goto L4d4
        L4d2:
            r14 = 1
            goto L4d5
        L4d4:
            r14 = 0
        L4d5:
            if (r9 != 0) goto L4dd
            if (r14 == 0) goto L4da
            goto L4dd
        L4da:
            r12 = r35
            goto L510
        L4dd:
            android.view.ViewGroup r9 = r7.f2056a
            java.util.WeakHashMap<android.view.View, n0.w> r14 = p227n0.C4661t.f18570a
            boolean r9 = p227n0.C4661t.f.m10588c(r9)
            if (r9 != 0) goto L513
            r9 = 2
            boolean r9 = androidx.fragment.app.AbstractC0375d0.m1131O(r9)
            if (r9 == 0) goto L50b
            java.lang.String r9 = "SpecialEffectsController: Container "
            java.lang.StringBuilder r9 = android.support.v4.media.C0144c.m256a(r9)
            android.view.ViewGroup r14 = r7.f2056a
            r9.append(r14)
            java.lang.String r14 = " has not been laid out. Completing operation "
            r9.append(r14)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            r12 = r35
            android.util.Log.v(r12, r9)
            goto L50d
        L50b:
            r12 = r35
        L50d:
            r5.m1114a()
        L510:
            r35 = r12
            goto L527
        L513:
            r12 = r35
            androidx.fragment.app.b1$d r9 = r5.f2089a
            androidx.fragment.app.n r9 = r9.f2068c
            j0.b r14 = r5.f2090b
            r40 = r3
            androidx.fragment.app.k r3 = new androidx.fragment.app.k
            r3.<init>(r7, r5)
            r11.mo1386u(r9, r0, r14, r3)
            r3 = r40
        L527:
            r33 = r13
            goto L4b3
        L52a:
            r12 = r35
            android.view.ViewGroup r3 = r7.f2056a
            java.util.WeakHashMap<android.view.View, n0.w> r4 = p227n0.C4661t.f18570a
            boolean r3 = p227n0.C4661t.f.m10588c(r3)
            if (r3 != 0) goto L537
            goto L55a
        L537:
            r3 = 4
            androidx.fragment.app.C0408t0.m1370o(r1, r3)
            java.util.ArrayList r20 = r11.m1396n(r15)
            android.view.ViewGroup r3 = r7.f2056a
            r11.mo1375c(r3, r0)
            android.view.ViewGroup r0 = r7.f2056a
            r16 = r11
            r17 = r0
            r18 = r6
            r19 = r15
            r21 = r32
            r16.m1397v(r17, r18, r19, r20, r21)
            r0 = 0
            androidx.fragment.app.C0408t0.m1370o(r1, r0)
            r11.mo1388x(r2, r6, r15)
        L55a:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r9 = r8.containsValue(r0)
            android.view.ViewGroup r11 = r7.f2056a
            android.content.Context r13 = r11.getContext()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r24.iterator()
            r0 = 0
        L570:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L61b
            java.lang.Object r1 = r15.next()
            r6 = r1
            androidx.fragment.app.c$b r6 = (androidx.fragment.app.C0371c.b) r6
            boolean r1 = r6.m1115b()
            if (r1 == 0) goto L584
            goto L5c3
        L584:
            androidx.fragment.app.w$a r1 = r6.m1113c(r13)
            if (r1 != 0) goto L58b
            goto L5c3
        L58b:
            android.animation.Animator r5 = r1.f2410b
            if (r5 != 0) goto L593
            r14.add(r6)
            goto L570
        L593:
            androidx.fragment.app.b1$d r4 = r6.f2089a
            androidx.fragment.app.n r1 = r4.f2068c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r3 = r8.get(r4)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5c7
            r2 = 2
            boolean r2 = androidx.fragment.app.AbstractC0375d0.m1131O(r2)
            if (r2 == 0) goto L5c3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Ignoring Animator set on "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " as this Fragment was involved in a Transition."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.v(r12, r1)
        L5c3:
            r6.m1114a()
            goto L570
        L5c7:
            androidx.fragment.app.b1$d$c r0 = r4.f2066a
            if (r0 != r10) goto L5cf
            r0 = 1
            r16 = 1
            goto L5d2
        L5cf:
            r0 = 0
            r16 = 0
        L5d2:
            r3 = r29
            if (r16 == 0) goto L5d9
            r3.remove(r4)
        L5d9:
            android.view.View r2 = r1.f2260C0
            r11.startViewTransition(r2)
            androidx.fragment.app.d r1 = new androidx.fragment.app.d
            r0 = r1
            r34 = r8
            r8 = r1
            r1 = r39
            r40 = r2
            r2 = r11
            r17 = r3
            r3 = r40
            r18 = r4
            r4 = r16
            r30 = r10
            r10 = r5
            r5 = r18
            r41 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.addListener(r8)
            r0 = r40
            r10.setTarget(r0)
            r10.start()
            r1 = r41
            j0.b r0 = r1.f2090b
            androidx.fragment.app.e r1 = new androidx.fragment.app.e
            r1.<init>(r7, r10)
            r0.m7756b(r1)
            r0 = 1
            r29 = r17
            r10 = r30
            r8 = r34
            goto L570
        L61b:
            r17 = r29
            java.util.Iterator r1 = r14.iterator()
        L621:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6a8
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.c$b r2 = (androidx.fragment.app.C0371c.b) r2
            androidx.fragment.app.b1$d r3 = r2.f2089a
            androidx.fragment.app.n r4 = r3.f2068c
            java.lang.String r5 = "Ignoring Animation set on "
            if (r9 == 0) goto L64a
            r3 = 2
            boolean r3 = androidx.fragment.app.AbstractC0375d0.m1131O(r3)
            if (r3 == 0) goto L66a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " as Animations cannot run alongside Transitions."
            goto L660
        L64a:
            r6 = 2
            if (r0 == 0) goto L66e
            boolean r3 = androidx.fragment.app.AbstractC0375d0.m1131O(r6)
            if (r3 == 0) goto L66a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " as Animations cannot run alongside Animators."
        L660:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r12, r3)
        L66a:
            r2.m1114a()
            goto L621
        L66e:
            android.view.View r4 = r4.f2260C0
            androidx.fragment.app.w$a r5 = r2.m1113c(r13)
            java.util.Objects.requireNonNull(r5)
            android.view.animation.Animation r5 = r5.f2409a
            java.util.Objects.requireNonNull(r5)
            androidx.fragment.app.b1$d$c r3 = r3.f2066a
            androidx.fragment.app.b1$d$c r6 = androidx.fragment.app.AbstractC0370b1.d.c.f2078Y
            if (r3 == r6) goto L689
            r4.startAnimation(r5)
            r2.m1114a()
            goto L69c
        L689:
            r11.startViewTransition(r4)
            androidx.fragment.app.w$b r3 = new androidx.fragment.app.w$b
            r3.<init>(r5, r11, r4)
            androidx.fragment.app.f r5 = new androidx.fragment.app.f
            r5.<init>(r7, r11, r4, r2)
            r3.setAnimationListener(r5)
            r4.startAnimation(r3)
        L69c:
            j0.b r3 = r2.f2090b
            androidx.fragment.app.g r5 = new androidx.fragment.app.g
            r5.<init>(r7, r4, r11, r2)
            r3.m7756b(r5)
            goto L621
        L6a8:
            java.util.Iterator r0 = r17.iterator()
        L6ac:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c2
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.b1$d r1 = (androidx.fragment.app.AbstractC0370b1.d) r1
            androidx.fragment.app.n r2 = r1.f2068c
            android.view.View r2 = r2.f2260C0
            androidx.fragment.app.b1$d$c r1 = r1.f2066a
            r1.m1109e(r2)
            goto L6ac
        L6c2:
            r17.clear()
            return
    }

    /* renamed from: j */
    public void m1110j(java.util.ArrayList<android.view.View> r5, android.view.View r6) {
            r4 = this;
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2e
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r1 = r0.isTransitionGroup()
            if (r1 == 0) goto L17
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L37
            r5.add(r0)
            goto L37
        L17:
            int r6 = r0.getChildCount()
            r1 = 0
        L1c:
            if (r1 >= r6) goto L37
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L2b
            r4.m1110j(r5, r2)
        L2b:
            int r1 = r1 + 1
            goto L1c
        L2e:
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L37
            r5.add(r6)
        L37:
            return
    }

    /* renamed from: k */
    public void m1111k(java.util.Map<java.lang.String, android.view.View> r5, android.view.View r6) {
            r4 = this;
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            java.lang.String r0 = p227n0.C4661t.h.m10606k(r6)
            if (r0 == 0) goto Lb
            r5.put(r0, r6)
        Lb:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L28
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L16:
            if (r1 >= r0) goto L28
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L25
            r4.m1111k(r5, r2)
        L25:
            int r1 = r1 + 1
            goto L16
        L28:
            return
    }

    /* renamed from: l */
    public void m1112l(p319s.C5934a<java.lang.String, android.view.View> r4, java.util.Collection<java.lang.String> r5) {
            r3 = this;
            java.util.Set r4 = r4.entrySet()
            s.g$b r4 = (p319s.AbstractC5940g.b) r4
            java.util.Iterator r4 = r4.iterator()
        La:
            r0 = r4
            s.g$d r0 = (p319s.AbstractC5940g.d) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            r0.next()
            r1 = r0
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            java.lang.String r1 = p227n0.C4661t.h.m10606k(r1)
            boolean r1 = r5.contains(r1)
            if (r1 != 0) goto La
            r0.remove()
            goto La
        L2f:
            return
    }
}
