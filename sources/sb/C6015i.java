package sb;

/* renamed from: sb.i */
/* loaded from: classes.dex */
public final class C6015i implements sb.InterfaceC6019m {

    /* renamed from: a */
    public java.util.Map<sb.EnumC6009c, ?> f23198a;

    /* renamed from: b */
    public sb.InterfaceC6019m[] f23199b;

    public C6015i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: a */
    public sb.C6021o mo2335a(p128hb.C3003h r2) {
            r1 = this;
            r0 = 0
            r1.m12498e(r0)
            sb.o r2 = r1.m12497d(r2)
            return r2
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: b */
    public void mo2336b() {
            r4 = this;
            sb.m[] r0 = r4.f23199b
            if (r0 == 0) goto L10
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            r3.mo2336b()
            int r2 = r2 + 1
            goto L6
        L10:
            return
    }

    @Override // sb.InterfaceC6019m
    /* renamed from: c */
    public sb.C6021o mo2337c(p128hb.C3003h r1, java.util.Map<sb.EnumC6009c, ?> r2) {
            r0 = this;
            r0.m12498e(r2)
            sb.o r1 = r0.m12497d(r1)
            return r1
    }

    /* renamed from: d */
    public final sb.C6021o m12497d(p128hb.C3003h r6) {
            r5 = this;
            sb.m[] r0 = r5.f23199b
            if (r0 == 0) goto L14
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L14
            r3 = r0[r2]
            java.util.Map<sb.c, ?> r4 = r5.f23198a     // Catch: sb.AbstractC6020n -> L11
            sb.o r6 = r3.mo2337c(r6, r4)     // Catch: sb.AbstractC6020n -> L11
            return r6
        L11:
            int r2 = r2 + 1
            goto L6
        L14:
            sb.k r6 = sb.C6017k.f23200a0
            throw r6
    }

    /* renamed from: e */
    public void m12498e(java.util.Map<sb.EnumC6009c, ?> r8) {
            r7 = this;
            r7.f23198a = r8
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L10
            sb.c r2 = sb.EnumC6009c.f23172b0
            boolean r2 = r8.containsKey(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            if (r8 != 0) goto L15
            r3 = 0
            goto L1d
        L15:
            sb.c r3 = sb.EnumC6009c.f23171a0
            java.lang.Object r3 = r8.get(r3)
            java.util.Collection r3 = (java.util.Collection) r3
        L1d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 == 0) goto Le8
            sb.a r5 = sb.EnumC6007a.f23165m0
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L7f
            sb.a r5 = sb.EnumC6007a.f23166n0
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L7f
            sb.a r5 = sb.EnumC6007a.f23158f0
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L7f
            sb.a r5 = sb.EnumC6007a.f23157e0
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L7f
            sb.a r5 = sb.EnumC6007a.f23152Z
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L7f
            sb.a r5 = sb.EnumC6007a.f23153a0
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L7f
            sb.a r5 = sb.EnumC6007a.f23154b0
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L7f
            sb.a r5 = sb.EnumC6007a.f23155c0
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L7f
            sb.a r5 = sb.EnumC6007a.f23159g0
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L7f
            sb.a r5 = sb.EnumC6007a.f23163k0
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L7f
            sb.a r5 = sb.EnumC6007a.f23164l0
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L7d
            goto L7f
        L7d:
            r5 = 0
            goto L80
        L7f:
            r5 = 1
        L80:
            if (r5 == 0) goto L8c
            if (r2 != 0) goto L8c
            hc.o r6 = new hc.o
            r6.<init>(r8, r0)
            r4.add(r6)
        L8c:
            sb.a r6 = sb.EnumC6007a.f23162j0
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L9c
            qc.a r6 = new qc.a
            r6.<init>()
            r4.add(r6)
        L9c:
            sb.a r6 = sb.EnumC6007a.f23156d0
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto Lac
            bc.a r6 = new bc.a
            r6.<init>()
            r4.add(r6)
        Lac:
            sb.a r6 = sb.EnumC6007a.f23151Y
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto Lbc
            tb.b r6 = new tb.b
            r6.<init>(r0)
            r4.add(r6)
        Lbc:
            sb.a r6 = sb.EnumC6007a.f23161i0
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto Lcc
            tb.b r6 = new tb.b
            r6.<init>(r1)
            r4.add(r6)
        Lcc:
            sb.a r6 = sb.EnumC6007a.f23160h0
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto Ldc
            fc.a r3 = new fc.a
            r3.<init>()
            r4.add(r3)
        Ldc:
            if (r5 == 0) goto Le8
            if (r2 == 0) goto Le8
            hc.o r3 = new hc.o
            r3.<init>(r8, r0)
            r4.add(r3)
        Le8:
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L12a
            if (r2 != 0) goto Lf8
            hc.o r3 = new hc.o
            r3.<init>(r8, r0)
            r4.add(r3)
        Lf8:
            qc.a r3 = new qc.a
            r3.<init>()
            r4.add(r3)
            bc.a r3 = new bc.a
            r3.<init>()
            r4.add(r3)
            tb.b r3 = new tb.b
            r3.<init>(r0)
            r4.add(r3)
            tb.b r3 = new tb.b
            r3.<init>(r1)
            r4.add(r3)
            fc.a r1 = new fc.a
            r1.<init>()
            r4.add(r1)
            if (r2 == 0) goto L12a
            hc.o r1 = new hc.o
            r1.<init>(r8, r0)
            r4.add(r1)
        L12a:
            int r8 = r4.size()
            sb.m[] r8 = new sb.InterfaceC6019m[r8]
            java.lang.Object[] r8 = r4.toArray(r8)
            sb.m[] r8 = (sb.InterfaceC6019m[]) r8
            r7.f23199b = r8
            return
    }
}
