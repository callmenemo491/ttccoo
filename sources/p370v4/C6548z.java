package p370v4;

/* renamed from: v4.z */
/* loaded from: classes.dex */
public final class C6548z {

    /* renamed from: a */
    public final java.util.List<p088f4.C2003e0> f25620a;

    /* renamed from: b */
    public final p216m4.InterfaceC4381z[] f25621b;

    public C6548z(java.util.List<p088f4.C2003e0> r1) {
            r0 = this;
            r0.<init>()
            r0.f25620a = r1
            int r1 = r1.size()
            m4.z[] r1 = new p216m4.InterfaceC4381z[r1]
            r0.f25621b = r1
            return
    }

    /* renamed from: a */
    public void m13286a(p216m4.InterfaceC4366k r10, p370v4.InterfaceC6525d0.d r11) {
            r9 = this;
            r0 = 0
            r1 = 0
        L2:
            m4.z[] r2 = r9.f25621b
            int r2 = r2.length
            if (r1 >= r2) goto L7b
            r11.m13253a()
            int r2 = r11.m13255c()
            r3 = 3
            m4.z r2 = r10.mo6048l(r2, r3)
            java.util.List<f4.e0> r3 = r9.f25620a
            java.lang.Object r3 = r3.get(r1)
            f4.e0 r3 = (p088f4.C2003e0) r3
            java.lang.String r4 = r3.f8896j0
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L30
            java.lang.String r5 = "application/cea-708"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L2e
            goto L30
        L2e:
            r5 = 0
            goto L31
        L30:
            r5 = 1
        L31:
            java.lang.String r6 = "Invalid closed caption mime type provided: "
            java.lang.String r7 = java.lang.String.valueOf(r4)
            int r8 = r7.length()
            if (r8 == 0) goto L42
            java.lang.String r6 = r6.concat(r7)
            goto L48
        L42:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            r6 = r7
        L48:
            p371v5.C6549a.m13289c(r5, r6)
            java.lang.String r5 = r3.f8885Y
            if (r5 == 0) goto L50
            goto L54
        L50:
            java.lang.String r5 = r11.m13254b()
        L54:
            f4.e0$b r6 = new f4.e0$b
            r6.<init>()
            r6.f8917a = r5
            r6.f8927k = r4
            int r4 = r3.f8888b0
            r6.f8920d = r4
            java.lang.String r4 = r3.f8887a0
            r6.f8919c = r4
            int r4 = r3.f8882B0
            r6.f8915C = r4
            java.util.List<byte[]> r3 = r3.f8898l0
            r6.f8929m = r3
            f4.e0 r3 = r6.m5193a()
            r2.mo5973e(r3)
            m4.z[] r3 = r9.f25621b
            r3[r1] = r2
            int r1 = r1 + 1
            goto L2
        L7b:
            return
    }
}
