package mc;

/* renamed from: mc.e */
/* loaded from: classes.dex */
public final class C4533e extends p128hb.C3003h {

    /* renamed from: d */
    public final boolean f18437d;

    public C4533e(mc.C4531c r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f18437d = r2
            return
    }

    /* renamed from: A */
    public mc.C4529a m10441A() {
            r14 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r14.f12119c
            mc.a[] r0 = (mc.C4529a[]) r0
            mc.b r1 = new mc.b
            r1.<init>()
            mc.b r2 = new mc.b
            r2.<init>()
            mc.b r3 = new mc.b
            r3.<init>()
            mc.b r4 = new mc.b
            r4.<init>()
            int r5 = r0.length
            r6 = 0
            r7 = 0
        L1b:
            r8 = 3
            if (r7 >= r5) goto L55
            r9 = r0[r7]
            if (r9 == 0) goto L52
            r9.m10435b()
            int r10 = r9.f18421e
            int r10 = r10 % 30
            int r9 = r9.f18422f
            boolean r11 = r14.f18437d
            if (r11 != 0) goto L31
            int r9 = r9 + 2
        L31:
            int r9 = r9 % r8
            r8 = 1
            if (r9 == 0) goto L4c
            if (r9 == r8) goto L41
            r8 = 2
            if (r9 == r8) goto L3b
            goto L52
        L3b:
            int r10 = r10 + 1
            r1.m10437b(r10)
            goto L52
        L41:
            int r8 = r10 / 3
            r4.m10437b(r8)
            int r10 = r10 % 3
            r3.m10437b(r10)
            goto L52
        L4c:
            int r10 = r10 * 3
            int r10 = r10 + r8
            r2.m10437b(r10)
        L52:
            int r7 = r7 + 1
            goto L1b
        L55:
            int[] r5 = r1.m10436a()
            int r5 = r5.length
            if (r5 == 0) goto Lbd
            int[] r5 = r2.m10436a()
            int r5 = r5.length
            if (r5 == 0) goto Lbd
            int[] r5 = r3.m10436a()
            int r5 = r5.length
            if (r5 == 0) goto Lbd
            int[] r5 = r4.m10436a()
            int r5 = r5.length
            if (r5 == 0) goto Lbd
            int[] r5 = r1.m10436a()
            r5 = r5[r6]
            if (r5 <= 0) goto Lbd
            int[] r5 = r2.m10436a()
            r5 = r5[r6]
            int[] r7 = r3.m10436a()
            r7 = r7[r6]
            int r5 = r5 + r7
            if (r5 < r8) goto Lbd
            int[] r5 = r2.m10436a()
            r5 = r5[r6]
            int[] r7 = r3.m10436a()
            r7 = r7[r6]
            int r5 = r5 + r7
            r7 = 90
            if (r5 <= r7) goto L9a
            goto Lbd
        L9a:
            mc.a r5 = new mc.a
            int[] r1 = r1.m10436a()
            r9 = r1[r6]
            int[] r1 = r2.m10436a()
            r10 = r1[r6]
            int[] r1 = r3.m10436a()
            r11 = r1[r6]
            int[] r1 = r4.m10436a()
            r12 = r1[r6]
            r13 = 0
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            r14.m10442B(r0, r5)
            return r5
        Lbd:
            r0 = 0
            return r0
    }

    /* renamed from: B */
    public final void m10442B(mc.C4529a[] r6, mc.C4529a r7) {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r6.length
            if (r0 >= r1) goto L4d
            r1 = r6[r0]
            r2 = r6[r0]
            if (r2 == 0) goto L4a
            int r2 = r1.f18421e
            int r2 = r2 % 30
            int r1 = r1.f18422f
            int r3 = r7.f18422f
            r4 = 0
            if (r1 <= r3) goto L18
            r6[r0] = r4
            goto L4a
        L18:
            boolean r3 = r5.f18437d
            if (r3 != 0) goto L1e
            int r1 = r1 + 2
        L1e:
            int r1 = r1 % 3
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L32
            r3 = 2
            if (r1 == r3) goto L29
            goto L4a
        L29:
            int r2 = r2 + 1
            int r1 = r7.f18418b
            if (r2 == r1) goto L4a
            r6[r0] = r4
            goto L4a
        L32:
            int r1 = r2 / 3
            int r3 = r7.f18419c
            if (r1 != r3) goto L3e
            int r2 = r2 % 3
            int r1 = r7.f18421e
            if (r2 == r1) goto L4a
        L3e:
            r6[r0] = r4
            goto L4a
        L41:
            int r2 = r2 * 3
            int r2 = r2 + r3
            int r1 = r7.f18420d
            if (r2 == r1) goto L4a
            r6[r0] = r4
        L4a:
            int r0 = r0 + 1
            goto L1
        L4d:
            return
    }

    @Override // p128hb.C3003h
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IsLeft: "
            r0.<init>(r1)
            boolean r1 = r2.f18437d
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
