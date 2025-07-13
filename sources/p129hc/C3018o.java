package p129hc;

/* renamed from: hc.o */
/* loaded from: classes.dex */
public final class C3018o extends p129hc.AbstractC3019p {

    /* renamed from: a */
    public final /* synthetic */ int f12153a;

    /* renamed from: b */
    public final java.lang.Object f12154b;

    public C3018o(java.util.Map r9, int r10) {
            r8 = this;
            sb.a r0 = sb.EnumC6007a.f23166n0
            sb.a r1 = sb.EnumC6007a.f23157e0
            sb.a r2 = sb.EnumC6007a.f23165m0
            sb.a r3 = sb.EnumC6007a.f23158f0
            r8.f12153a = r10
            r4 = 0
            r5 = 0
            r6 = 1
            if (r10 == r6) goto L117
            r8.<init>()
            if (r9 != 0) goto L15
            goto L1e
        L15:
            sb.c r10 = sb.EnumC6009c.f23171a0
            java.lang.Object r10 = r9.get(r10)
            r4 = r10
            java.util.Collection r4 = (java.util.Collection) r4
        L1e:
            if (r9 == 0) goto L2a
            sb.c r10 = sb.EnumC6009c.f23175e0
            java.lang.Object r10 = r9.get(r10)
            if (r10 == 0) goto L2a
            r10 = 1
            goto L2b
        L2a:
            r10 = 0
        L2b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            if (r4 == 0) goto Lc2
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L4a
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L4a
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L4a
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L52
        L4a:
            hc.o r0 = new hc.o
            r0.<init>(r9, r6)
            r7.add(r0)
        L52:
            sb.a r0 = sb.EnumC6007a.f23153a0
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L62
            hc.e r0 = new hc.e
            r0.<init>(r10)
            r7.add(r0)
        L62:
            sb.a r10 = sb.EnumC6007a.f23154b0
            boolean r10 = r4.contains(r10)
            if (r10 == 0) goto L72
            hc.g r10 = new hc.g
            r10.<init>()
            r7.add(r10)
        L72:
            sb.a r10 = sb.EnumC6007a.f23155c0
            boolean r10 = r4.contains(r10)
            if (r10 == 0) goto L82
            hc.c r10 = new hc.c
            r10.<init>()
            r7.add(r10)
        L82:
            sb.a r10 = sb.EnumC6007a.f23159g0
            boolean r10 = r4.contains(r10)
            if (r10 == 0) goto L92
            hc.m r10 = new hc.m
            r10.<init>()
            r7.add(r10)
        L92:
            sb.a r10 = sb.EnumC6007a.f23152Z
            boolean r10 = r4.contains(r10)
            if (r10 == 0) goto La2
            hc.a r10 = new hc.a
            r10.<init>()
            r7.add(r10)
        La2:
            sb.a r10 = sb.EnumC6007a.f23163k0
            boolean r10 = r4.contains(r10)
            if (r10 == 0) goto Lb2
            ic.e r10 = new ic.e
            r10.<init>()
            r7.add(r10)
        Lb2:
            sb.a r10 = sb.EnumC6007a.f23164l0
            boolean r10 = r4.contains(r10)
            if (r10 == 0) goto Lc2
            jc.c r10 = new jc.c
            r10.<init>()
            r7.add(r10)
        Lc2:
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L108
            hc.o r10 = new hc.o
            r10.<init>(r9, r6)
            r7.add(r10)
            hc.e r9 = new hc.e
            r9.<init>(r5)
            r7.add(r9)
            hc.a r9 = new hc.a
            r9.<init>()
            r7.add(r9)
            hc.g r9 = new hc.g
            r9.<init>()
            r7.add(r9)
            hc.c r9 = new hc.c
            r9.<init>()
            r7.add(r9)
            hc.m r9 = new hc.m
            r9.<init>()
            r7.add(r9)
            ic.e r9 = new ic.e
            r9.<init>()
            r7.add(r9)
            jc.c r9 = new jc.c
            r9.<init>()
            r7.add(r9)
        L108:
            int r9 = r7.size()
            hc.p[] r9 = new p129hc.AbstractC3019p[r9]
            java.lang.Object[] r9 = r7.toArray(r9)
            hc.p[] r9 = (p129hc.AbstractC3019p[]) r9
            r8.f12154b = r9
            return
        L117:
            r8.<init>()
            if (r9 != 0) goto L11d
            goto L126
        L11d:
            sb.c r10 = sb.EnumC6009c.f23171a0
            java.lang.Object r9 = r9.get(r10)
            r4 = r9
            java.util.Collection r4 = (java.util.Collection) r4
        L126:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r4 == 0) goto L163
            boolean r10 = r4.contains(r3)
            if (r10 == 0) goto L139
            hc.i r10 = new hc.i
            r10.<init>()
            goto L144
        L139:
            boolean r10 = r4.contains(r2)
            if (r10 == 0) goto L147
            hc.k r10 = new hc.k
            r10.<init>(r6)
        L144:
            r9.add(r10)
        L147:
            boolean r10 = r4.contains(r1)
            if (r10 == 0) goto L155
            hc.k r10 = new hc.k
            r10.<init>(r5)
            r9.add(r10)
        L155:
            boolean r10 = r4.contains(r0)
            if (r10 == 0) goto L163
            hc.u r10 = new hc.u
            r10.<init>()
            r9.add(r10)
        L163:
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L181
            hc.i r10 = new hc.i
            r10.<init>()
            r9.add(r10)
            hc.k r10 = new hc.k
            r10.<init>(r5)
            r9.add(r10)
            hc.u r10 = new hc.u
            r10.<init>()
            r9.add(r10)
        L181:
            int r10 = r9.size()
            hc.s[] r10 = new p129hc.AbstractC3022s[r10]
            java.lang.Object[] r9 = r9.toArray(r10)
            hc.s[] r9 = (p129hc.AbstractC3022s[]) r9
            r8.f12154b = r9
            return
    }

    @Override // p129hc.AbstractC3019p, sb.InterfaceC6019m
    /* renamed from: b */
    public void mo2336b() {
            r4 = this;
            int r0 = r4.f12153a
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L17
        L7:
            java.lang.Object r0 = r4.f12154b
            hc.p[] r0 = (p129hc.AbstractC3019p[]) r0
            int r2 = r0.length
        Lc:
            if (r1 >= r2) goto L16
            r3 = r0[r1]
            r3.mo2336b()
            int r1 = r1 + 1
            goto Lc
        L16:
            return
        L17:
            java.lang.Object r0 = r4.f12154b
            hc.s[] r0 = (p129hc.AbstractC3022s[]) r0
            int r2 = r0.length
        L1c:
            if (r1 >= r2) goto L26
            r3 = r0[r1]
            java.util.Objects.requireNonNull(r3)
            int r1 = r1 + 1
            goto L1c
        L26:
            return
    }

    @Override // p129hc.AbstractC3019p
    /* renamed from: d */
    public sb.C6021o mo7401d(int r8, p453zb.C7269a r9, java.util.Map r10) {
            r7 = this;
            int r0 = r7.f12153a
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L1b
        L7:
            java.lang.Object r0 = r7.f12154b
            hc.p[] r0 = (p129hc.AbstractC3019p[]) r0
            int r2 = r0.length
        Lc:
            if (r1 >= r2) goto L18
            r3 = r0[r1]
            sb.o r8 = r3.mo7401d(r8, r9, r10)     // Catch: sb.AbstractC6020n -> L15
            return r8
        L15:
            int r1 = r1 + 1
            goto Lc
        L18:
            sb.k r8 = sb.C6017k.f23200a0
            throw r8
        L1b:
            sb.a r0 = sb.EnumC6007a.f23165m0
            int[] r2 = p129hc.AbstractC3022s.m7429p(r9)
            java.lang.Object r3 = r7.f12154b
            hc.s[] r3 = (p129hc.AbstractC3022s[]) r3
            int r4 = r3.length
            r5 = 0
        L27:
            if (r5 >= r4) goto L75
            r6 = r3[r5]
            sb.o r8 = r6.mo7416n(r8, r9, r2, r10)     // Catch: sb.AbstractC6020n -> L72
            sb.a r9 = r8.f23209d
            sb.a r2 = sb.EnumC6007a.f23158f0
            r3 = 1
            if (r9 != r2) goto L42
            java.lang.String r9 = r8.f23206a
            char r9 = r9.charAt(r1)
            r2 = 48
            if (r9 != r2) goto L42
            r9 = 1
            goto L43
        L42:
            r9 = 0
        L43:
            if (r10 != 0) goto L47
            r10 = 0
            goto L4f
        L47:
            sb.c r2 = sb.EnumC6009c.f23171a0
            java.lang.Object r10 = r10.get(r2)
            java.util.Collection r10 = (java.util.Collection) r10
        L4f:
            if (r10 == 0) goto L57
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L58
        L57:
            r1 = 1
        L58:
            if (r9 == 0) goto L71
            if (r1 == 0) goto L71
            sb.o r9 = new sb.o
            java.lang.String r10 = r8.f23206a
            java.lang.String r10 = r10.substring(r3)
            byte[] r1 = r8.f23207b
            sb.q[] r2 = r8.f23208c
            r9.<init>(r10, r1, r2, r0)
            java.util.Map<sb.p, java.lang.Object> r8 = r8.f23210e
            r9.m12499a(r8)
            r8 = r9
        L71:
            return r8
        L72:
            int r5 = r5 + 1
            goto L27
        L75:
            sb.k r8 = sb.C6017k.f23200a0
            throw r8
    }
}
