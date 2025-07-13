package ac;

/* renamed from: ac.b */
/* loaded from: classes.dex */
public final class C0056b {

    /* renamed from: a */
    public final ac.C0055a f146a;

    /* renamed from: b */
    public final int[] f147b;

    public C0056b(ac.C0055a r5, int[] r6) {
            r4 = this;
            r4.<init>()
            int r0 = r6.length
            if (r0 == 0) goto L31
            r4.f146a = r5
            int r5 = r6.length
            r0 = 1
            if (r5 <= r0) goto L2e
            r1 = 0
            r2 = r6[r1]
            if (r2 != 0) goto L2e
            r2 = 1
        L12:
            if (r2 >= r5) goto L1b
            r3 = r6[r2]
            if (r3 != 0) goto L1b
            int r2 = r2 + 1
            goto L12
        L1b:
            if (r2 != r5) goto L24
            int[] r5 = new int[r0]
            r5[r1] = r1
            r4.f147b = r5
            return
        L24:
            int r5 = r5 - r2
            int[] r5 = new int[r5]
            r4.f147b = r5
            int r0 = r5.length
            java.lang.System.arraycopy(r6, r2, r5, r1, r0)
            return
        L2e:
            r4.f147b = r6
            return
        L31:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }

    /* renamed from: a */
    public ac.C0056b m81a(ac.C0056b r8) {
            r7 = this;
            ac.a r0 = r7.f146a
            ac.a r1 = r8.f146a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            boolean r0 = r7.m85e()
            if (r0 == 0) goto L11
            return r8
        L11:
            boolean r0 = r8.m85e()
            if (r0 == 0) goto L18
            return r7
        L18:
            int[] r0 = r7.f147b
            int[] r8 = r8.f147b
            int r1 = r0.length
            int r2 = r8.length
            if (r1 <= r2) goto L21
            goto L24
        L21:
            r6 = r0
            r0 = r8
            r8 = r6
        L24:
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r2 = r0.length
            int r3 = r8.length
            int r2 = r2 - r3
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            r3 = r2
        L2f:
            int r4 = r0.length
            if (r3 >= r4) goto L3e
            int r4 = r3 - r2
            r4 = r8[r4]
            r5 = r0[r3]
            r4 = r4 ^ r5
            r1[r3] = r4
            int r3 = r3 + 1
            goto L2f
        L3e:
            ac.b r8 = new ac.b
            ac.a r0 = r7.f146a
            r8.<init>(r0, r1)
            return r8
        L46:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "GenericGFPolys do not have same GenericGF field"
            r8.<init>(r0)
            throw r8
    }

    /* renamed from: b */
    public int m82b(int r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L8
            int r6 = r5.m83c(r0)
            return r6
        L8:
            r1 = 1
            if (r6 != r1) goto L1a
            int[] r6 = r5.f147b
            int r1 = r6.length
            r2 = 0
        Lf:
            if (r0 >= r1) goto L19
            r3 = r6[r0]
            ac.a r4 = ac.C0055a.f131h
            r2 = r2 ^ r3
            int r0 = r0 + 1
            goto Lf
        L19:
            return r2
        L1a:
            int[] r2 = r5.f147b
            r0 = r2[r0]
            int r2 = r2.length
        L1f:
            if (r1 >= r2) goto L2f
            ac.a r3 = r5.f146a
            int r0 = r3.m80c(r6, r0)
            int[] r3 = r5.f147b
            r3 = r3[r1]
            r0 = r0 ^ r3
            int r1 = r1 + 1
            goto L1f
        L2f:
            return r0
    }

    /* renamed from: c */
    public int m83c(int r3) {
            r2 = this;
            int[] r0 = r2.f147b
            int r1 = r0.length
            int r1 = r1 + (-1)
            int r1 = r1 - r3
            r3 = r0[r1]
            return r3
    }

    /* renamed from: d */
    public int m84d() {
            r1 = this;
            int[] r0 = r1.f147b
            int r0 = r0.length
            int r0 = r0 + (-1)
            return r0
    }

    /* renamed from: e */
    public boolean m85e() {
            r2 = this;
            int[] r0 = r2.f147b
            r1 = 0
            r0 = r0[r1]
            if (r0 != 0) goto L9
            r0 = 1
            return r0
        L9:
            return r1
    }

    /* renamed from: f */
    public ac.C0056b m86f(int r6) {
            r5 = this;
            if (r6 != 0) goto L7
            ac.a r6 = r5.f146a
            ac.b r6 = r6.f141c
            return r6
        L7:
            r0 = 1
            if (r6 != r0) goto Lb
            return r5
        Lb:
            int[] r0 = r5.f147b
            int r0 = r0.length
            int[] r1 = new int[r0]
            r2 = 0
        L11:
            if (r2 >= r0) goto L22
            ac.a r3 = r5.f146a
            int[] r4 = r5.f147b
            r4 = r4[r2]
            int r3 = r3.m80c(r4, r6)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L11
        L22:
            ac.b r6 = new ac.b
            ac.a r0 = r5.f146a
            r6.<init>(r0, r1)
            return r6
    }

    /* renamed from: g */
    public ac.C0056b m87g(ac.C0056b r13) {
            r12 = this;
            ac.a r0 = r12.f146a
            ac.a r1 = r13.f146a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
            boolean r0 = r12.m85e()
            if (r0 != 0) goto L49
            boolean r0 = r13.m85e()
            if (r0 == 0) goto L17
            goto L49
        L17:
            int[] r0 = r12.f147b
            int r1 = r0.length
            int[] r13 = r13.f147b
            int r2 = r13.length
            int r3 = r1 + r2
            int r3 = r3 + (-1)
            int[] r3 = new int[r3]
            r4 = 0
            r5 = 0
        L25:
            if (r5 >= r1) goto L41
            r6 = r0[r5]
            r7 = 0
        L2a:
            if (r7 >= r2) goto L3e
            int r8 = r5 + r7
            r9 = r3[r8]
            ac.a r10 = r12.f146a
            r11 = r13[r7]
            int r10 = r10.m80c(r6, r11)
            r9 = r9 ^ r10
            r3[r8] = r9
            int r7 = r7 + 1
            goto L2a
        L3e:
            int r5 = r5 + 1
            goto L25
        L41:
            ac.b r13 = new ac.b
            ac.a r0 = r12.f146a
            r13.<init>(r0, r3)
            return r13
        L49:
            ac.a r13 = r12.f146a
            ac.b r13 = r13.f141c
            return r13
        L4e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "GenericGFPolys do not have same GenericGF field"
            r13.<init>(r0)
            throw r13
    }

    /* renamed from: h */
    public ac.C0056b m88h(int r5, int r6) {
            r4 = this;
            if (r5 < 0) goto L29
            if (r6 != 0) goto L9
            ac.a r5 = r4.f146a
            ac.b r5 = r5.f141c
            return r5
        L9:
            int[] r0 = r4.f147b
            int r0 = r0.length
            int r5 = r5 + r0
            int[] r5 = new int[r5]
            r1 = 0
        L10:
            if (r1 >= r0) goto L21
            ac.a r2 = r4.f146a
            int[] r3 = r4.f147b
            r3 = r3[r1]
            int r2 = r2.m80c(r3, r6)
            r5[r1] = r2
            int r1 = r1 + 1
            goto L10
        L21:
            ac.b r6 = new ac.b
            ac.a r0 = r4.f146a
            r6.<init>(r0, r5)
            return r6
        L29:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.m84d()
            int r1 = r1 * 8
            r0.<init>(r1)
            int r1 = r5.m84d()
        Lf:
            if (r1 < 0) goto L6c
            int r2 = r5.m83c(r1)
            if (r2 == 0) goto L69
            if (r2 >= 0) goto L20
            java.lang.String r3 = " - "
            r0.append(r3)
            int r2 = -r2
            goto L2b
        L20:
            int r3 = r0.length()
            if (r3 <= 0) goto L2b
            java.lang.String r3 = " + "
            r0.append(r3)
        L2b:
            r3 = 1
            if (r1 == 0) goto L30
            if (r2 == r3) goto L50
        L30:
            ac.a r4 = r5.f146a
            java.util.Objects.requireNonNull(r4)
            if (r2 == 0) goto L63
            int[] r4 = r4.f140b
            r2 = r4[r2]
            if (r2 != 0) goto L40
            r2 = 49
            goto L44
        L40:
            if (r2 != r3) goto L48
            r2 = 97
        L44:
            r0.append(r2)
            goto L50
        L48:
            java.lang.String r4 = "a^"
            r0.append(r4)
            r0.append(r2)
        L50:
            if (r1 == 0) goto L69
            if (r1 != r3) goto L5a
            r2 = 120(0x78, float:1.68E-43)
            r0.append(r2)
            goto L69
        L5a:
            java.lang.String r2 = "x^"
            r0.append(r2)
            r0.append(r1)
            goto L69
        L63:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L69:
            int r1 = r1 + (-1)
            goto Lf
        L6c:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
