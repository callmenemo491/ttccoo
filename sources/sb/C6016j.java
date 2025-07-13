package sb;

/* renamed from: sb.j */
/* loaded from: classes.dex */
public final class C6016j implements sb.InterfaceC6025s {
    public C6016j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // sb.InterfaceC6025s
    /* renamed from: d */
    public p453zb.C7270b mo7086d(java.lang.String r8, sb.EnumC6007a r9, int r10, int r11, java.util.Map<sb.EnumC6011e, ?> r12) {
            r7 = this;
            int r0 = r9.ordinal()
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L29;
                case 2: goto L49;
                case 3: goto L43;
                case 4: goto L3d;
                case 5: goto L21;
                case 6: goto L6c;
                case 7: goto L5e;
                case 8: goto L37;
                case 9: goto L7;
                case 10: goto L2f;
                case 11: goto L4f;
                case 12: goto L7;
                case 13: goto L7;
                case 14: goto L56;
                case 15: goto L65;
                default: goto L7;
            }
        L7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "No encoder available for format "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L1b:
            tb.c r0 = new tb.c
            r0.<init>()
            goto L71
        L21:
            y.e r0 = new y.e
            r1 = 23
            r0.<init>(r1)
            goto L71
        L29:
            hc.b r0 = new hc.b
            r0.<init>()
            goto L71
        L2f:
            y.e r0 = new y.e
            r1 = 24
            r0.<init>(r1)
            goto L71
        L37:
            hc.n r0 = new hc.n
            r0.<init>()
            goto L71
        L3d:
            hc.d r0 = new hc.d
            r0.<init>()
            goto L71
        L43:
            hc.h r0 = new hc.h
            r0.<init>()
            goto L71
        L49:
            hc.f r0 = new hc.f
            r0.<init>()
            goto L71
        L4f:
            t8.e r0 = new t8.e
            r1 = 6
            r0.<init>(r1)
            goto L71
        L56:
            h7.rb r0 = new h7.rb
            r1 = 20
            r0.<init>(r1)
            goto L71
        L5e:
            hc.j r0 = new hc.j
            r1 = 0
            r0.<init>(r1)
            goto L71
        L65:
            hc.j r0 = new hc.j
            r1 = 1
            r0.<init>(r1)
            goto L71
        L6c:
            hc.l r0 = new hc.l
            r0.<init>()
        L71:
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            zb.b r8 = r1.mo7086d(r2, r3, r4, r5, r6)
            return r8
    }
}
