package p185k7;

/* renamed from: k7.z6 */
/* loaded from: classes.dex */
public final class C4066z6 extends p185k7.C3877l {

    /* renamed from: Z */
    public final androidx.fragment.app.C0392l0 f16982Z;

    public C4066z6(androidx.fragment.app.C0392l0 r1) {
            r0 = this;
            r0.<init>()
            r0.f16982Z = r1
            return
    }

    @Override // p185k7.C3877l, p185k7.InterfaceC3916o
    /* renamed from: p */
    public final p185k7.InterfaceC3916o mo8361p(java.lang.String r17, p365v.C6476c r18, java.util.List<p185k7.InterfaceC3916o> r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r5 = 5
            r7 = 1
            r8 = 2
            r9 = 3
            r10 = 4
            java.lang.String r11 = "setEventName"
            java.lang.String r12 = "setParamValue"
            java.lang.String r13 = "getParams"
            java.lang.String r14 = "getParamValue"
            java.lang.String r15 = "getTimestamp"
            java.lang.String r6 = "getEventName"
            switch(r4) {
                case 21624207: goto L49;
                case 45521504: goto L41;
                case 146575578: goto L39;
                case 700587132: goto L31;
                case 920706790: goto L29;
                case 1570616835: goto L21;
                default: goto L20;
            }
        L20:
            goto L51
        L21:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L51
            r4 = 4
            goto L52
        L29:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L51
            r4 = 5
            goto L52
        L31:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L51
            r4 = 2
            goto L52
        L39:
            boolean r4 = r1.equals(r14)
            if (r4 == 0) goto L51
            r4 = 1
            goto L52
        L41:
            boolean r4 = r1.equals(r15)
            if (r4 == 0) goto L51
            r4 = 3
            goto L52
        L49:
            boolean r4 = r1.equals(r6)
            if (r4 == 0) goto L51
            r4 = 0
            goto L52
        L51:
            r4 = -1
        L52:
            if (r4 == 0) goto L147
            if (r4 == r7) goto L11a
            if (r4 == r8) goto Le8
            if (r4 == r9) goto Ld1
            if (r4 == r10) goto L95
            if (r4 == r5) goto L63
            k7.o r1 = super.mo8361p(r17, r18, r19)
            return r1
        L63:
            p124h7.C2939x3.m7264N(r12, r8, r3)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r2.m13117i(r1)
            java.lang.String r1 = r1.mo8357i()
            java.lang.Object r3 = r3.get(r7)
            k7.o r3 = (p185k7.InterfaceC3916o) r3
            k7.o r2 = r2.m13117i(r3)
            androidx.fragment.app.l0 r3 = r0.f16982Z
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r3 = r3.f2231a0
            k7.b r3 = (p185k7.C3738b) r3
            java.lang.Object r4 = p124h7.C2939x3.m7260J(r2)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f16463c
            if (r4 != 0) goto L91
            r3.remove(r1)
            goto L94
        L91:
            r3.put(r1, r4)
        L94:
            return r2
        L95:
            p124h7.C2939x3.m7264N(r11, r7, r3)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r2.m13117i(r1)
            k7.o r2 = p185k7.InterfaceC3916o.f16782G
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Lc9
            k7.o r2 = p185k7.InterfaceC3916o.f16783H
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Lc9
            androidx.fragment.app.l0 r2 = r0.f16982Z
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r2 = r2.f2231a0
            k7.b r2 = (p185k7.C3738b) r2
            java.lang.String r3 = r1.mo8357i()
            r2.f16461a = r3
            k7.r r2 = new k7.r
            java.lang.String r1 = r1.mo8357i()
            r2.<init>(r1)
            return r2
        Lc9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        Ld1:
            r1 = 0
            p124h7.C2939x3.m7264N(r15, r1, r3)
            androidx.fragment.app.l0 r1 = r0.f16982Z
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r1.f2231a0
            k7.b r1 = (p185k7.C3738b) r1
            k7.g r2 = new k7.g
            long r3 = r1.f16462b
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        Le8:
            r1 = 0
            p124h7.C2939x3.m7264N(r13, r1, r3)
            androidx.fragment.app.l0 r1 = r0.f16982Z
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r1.f2231a0
            k7.b r1 = (p185k7.C3738b) r1
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f16463c
            k7.l r2 = new k7.l
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L101:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L119
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            k7.o r5 = p052d6.C1306f0.m3780i(r5)
            r2.mo8356h(r4, r5)
            goto L101
        L119:
            return r2
        L11a:
            p124h7.C2939x3.m7264N(r14, r7, r3)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r2.m13117i(r1)
            java.lang.String r1 = r1.mo8357i()
            androidx.fragment.app.l0 r2 = r0.f16982Z
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r2 = r2.f2231a0
            k7.b r2 = (p185k7.C3738b) r2
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.f16463c
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L141
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f16463c
            java.lang.Object r1 = r2.get(r1)
            goto L142
        L141:
            r1 = 0
        L142:
            k7.o r1 = p052d6.C1306f0.m3780i(r1)
            return r1
        L147:
            r1 = 0
            p124h7.C2939x3.m7264N(r6, r1, r3)
            androidx.fragment.app.l0 r1 = r0.f16982Z
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r1.f2231a0
            k7.b r1 = (p185k7.C3738b) r1
            k7.r r2 = new k7.r
            java.lang.String r1 = r1.f16461a
            r2.<init>(r1)
            return r2
    }
}
