package p185k7;

/* renamed from: k7.l0 */
/* loaded from: classes.dex */
public final class C3878l0 {

    /* renamed from: a */
    public final p185k7.C3811g2 f16730a;

    /* renamed from: b */
    public p365v.C6476c f16731b;

    /* renamed from: c */
    public final androidx.fragment.app.C0392l0 f16732c;

    /* renamed from: d */
    public final androidx.appcompat.widget.C0311x f16733d;

    public C3878l0() {
            r4 = this;
            k7.g2 r0 = new k7.g2
            r0.<init>()
            r4.<init>()
            r4.f16730a = r0
            v.c r1 = r0.f16647b
            v.c r1 = r1.m13116h()
            r4.f16731b = r1
            androidx.fragment.app.l0 r1 = new androidx.fragment.app.l0
            r2 = 17
            r1.<init>(r2)
            r4.f16732c = r1
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x
            r1.<init>(r2)
            r4.f16733d = r1
            k7.a r1 = new k7.a
            r2 = 0
            r1.<init>(r4, r2)
            androidx.lifecycle.c0 r2 = r0.f16649d
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r2.f2478a
            java.lang.String r3 = "internal.registerCallback"
            r2.put(r3, r1)
            k7.a r1 = new k7.a
            r2 = 1
            r1.<init>(r4, r2)
            androidx.lifecycle.c0 r0 = r0.f16649d
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f2478a
            java.lang.String r2 = "internal.eventLogger"
            r0.put(r2, r1)
            return
    }

    /* renamed from: a */
    public final void m8785a(p185k7.C3933p3 r8) {
            r7 = this;
            k7.g2 r0 = r7.f16730a     // Catch: java.lang.Throwable -> Lcd
            v.c r0 = r0.f16647b     // Catch: java.lang.Throwable -> Lcd
            v.c r0 = r0.m13116h()     // Catch: java.lang.Throwable -> Lcd
            r7.f16731b = r0     // Catch: java.lang.Throwable -> Lcd
            java.util.List r0 = r8.m8876u()     // Catch: java.lang.Throwable -> Lcd
            k7.g2 r1 = r7.f16730a     // Catch: java.lang.Throwable -> Lcd
            v.c r2 = r7.f16731b     // Catch: java.lang.Throwable -> Lcd
            r3 = 0
            k7.s3[] r4 = new p185k7.C3972s3[r3]     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object[] r0 = r0.toArray(r4)     // Catch: java.lang.Throwable -> Lcd
            k7.s3[] r0 = (p185k7.C3972s3[]) r0     // Catch: java.lang.Throwable -> Lcd
            k7.o r0 = r1.m8549a(r2, r0)     // Catch: java.lang.Throwable -> Lcd
            boolean r0 = r0 instanceof p185k7.C3794f     // Catch: java.lang.Throwable -> Lcd
            if (r0 != 0) goto Lc5
            k7.n3 r8 = r8.m8875s()     // Catch: java.lang.Throwable -> Lcd
            java.util.List r8 = r8.m8839v()     // Catch: java.lang.Throwable -> Lcd
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lcd
        L2f:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> Lcd
            if (r0 == 0) goto Lc4
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> Lcd
            k7.o3 r0 = (p185k7.C3920o3) r0     // Catch: java.lang.Throwable -> Lcd
            java.util.List r1 = r0.m8859u()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = r0.m8858t()     // Catch: java.lang.Throwable -> Lcd
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lcd
        L47:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lcd
            k7.s3 r2 = (p185k7.C3972s3) r2     // Catch: java.lang.Throwable -> Lcd
            k7.g2 r4 = r7.f16730a     // Catch: java.lang.Throwable -> Lcd
            v.c r5 = r7.f16731b     // Catch: java.lang.Throwable -> Lcd
            r6 = 1
            k7.s3[] r6 = new p185k7.C3972s3[r6]     // Catch: java.lang.Throwable -> Lcd
            r6[r3] = r2     // Catch: java.lang.Throwable -> Lcd
            k7.o r2 = r4.m8549a(r5, r6)     // Catch: java.lang.Throwable -> Lcd
            boolean r4 = r2 instanceof p185k7.C3877l     // Catch: java.lang.Throwable -> Lcd
            if (r4 == 0) goto Lbc
            v.c r4 = r7.f16731b     // Catch: java.lang.Throwable -> Lcd
            boolean r5 = r4.m13122n(r0)     // Catch: java.lang.Throwable -> Lcd
            if (r5 != 0) goto L6e
            r4 = 0
            goto L94
        L6e:
            k7.o r4 = r4.m13119k(r0)     // Catch: java.lang.Throwable -> Lcd
            boolean r5 = r4 instanceof p185k7.AbstractC3822h     // Catch: java.lang.Throwable -> Lcd
            if (r5 != 0) goto L92
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = "Invalid function name: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lcd
            int r2 = r0.length()     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto L89
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> Lcd
            goto L8e
        L89:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lcd
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lcd
        L8e:
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lcd
            throw r8     // Catch: java.lang.Throwable -> Lcd
        L92:
            k7.h r4 = (p185k7.AbstractC3822h) r4     // Catch: java.lang.Throwable -> Lcd
        L94:
            if (r4 != 0) goto Lb2
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = "Rule function is undefined: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lcd
            int r2 = r0.length()     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto La9
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> Lcd
            goto Lae
        La9:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lcd
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lcd
        Lae:
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lcd
            throw r8     // Catch: java.lang.Throwable -> Lcd
        Lb2:
            v.c r5 = r7.f16731b     // Catch: java.lang.Throwable -> Lcd
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Throwable -> Lcd
            r4.mo8522b(r5, r2)     // Catch: java.lang.Throwable -> Lcd
            goto L47
        Lbc:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "Invalid rule definition"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lcd
            throw r8     // Catch: java.lang.Throwable -> Lcd
        Lc4:
            return
        Lc5:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "Program loading failed"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> Lcd
            throw r8     // Catch: java.lang.Throwable -> Lcd
        Lcd:
            r8 = move-exception
            k7.d1 r0 = new k7.d1
            r0.<init>(r8)
            throw r0
    }

    /* renamed from: b */
    public final boolean m8786b(p185k7.C3738b r4) {
            r3 = this;
            androidx.fragment.app.l0 r0 = r3.f16732c     // Catch: java.lang.Throwable -> L4a
            r0.f2230Z = r4     // Catch: java.lang.Throwable -> L4a
            k7.b r4 = r4.m8218a()     // Catch: java.lang.Throwable -> L4a
            r0.f2231a0 = r4     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r4 = r0.f2232b0     // Catch: java.lang.Throwable -> L4a
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L4a
            r4.clear()     // Catch: java.lang.Throwable -> L4a
            k7.g2 r4 = r3.f16730a     // Catch: java.lang.Throwable -> L4a
            v.c r4 = r4.f16648c     // Catch: java.lang.Throwable -> L4a
            k7.g r0 = new k7.g     // Catch: java.lang.Throwable -> L4a
            r1 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "runtime.counter"
            r4.m13121m(r1, r0)     // Catch: java.lang.Throwable -> L4a
            androidx.appcompat.widget.x r4 = r3.f16733d     // Catch: java.lang.Throwable -> L4a
            v.c r0 = r3.f16731b     // Catch: java.lang.Throwable -> L4a
            v.c r0 = r0.m13116h()     // Catch: java.lang.Throwable -> L4a
            androidx.fragment.app.l0 r1 = r3.f16732c     // Catch: java.lang.Throwable -> L4a
            r4.m830v(r0, r1)     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r3.m8787c()     // Catch: java.lang.Throwable -> L4a
            r0 = 1
            if (r4 != 0) goto L49
            androidx.fragment.app.l0 r4 = r3.f16732c     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r4 = r4.f2232b0     // Catch: java.lang.Throwable -> L4a
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4a
            r4 = r4 ^ r0
            if (r4 == 0) goto L47
            goto L49
        L47:
            r4 = 0
            return r4
        L49:
            return r0
        L4a:
            r4 = move-exception
            k7.d1 r0 = new k7.d1
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: c */
    public final boolean m8787c() {
            r2 = this;
            androidx.fragment.app.l0 r0 = r2.f16732c
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r0.f2231a0
            k7.b r1 = (p185k7.C3738b) r1
            java.util.ArrayList<androidx.fragment.app.n> r0 = r0.f2230Z
            k7.b r0 = (p185k7.C3738b) r0
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }
}
