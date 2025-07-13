package p352u5;

/* renamed from: u5.g */
/* loaded from: classes.dex */
public final class C6316g extends p352u5.AbstractC6310d {

    /* renamed from: e */
    public p352u5.C6323l f24683e;

    /* renamed from: f */
    public byte[] f24684f;

    /* renamed from: g */
    public int f24685g;

    /* renamed from: h */
    public int f24686h;

    public C6316g() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // p352u5.InterfaceC6314f
    /* renamed from: b */
    public int mo6020b(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.f24686h
            if (r0 != 0) goto La
            r3 = -1
            return r3
        La:
            int r5 = java.lang.Math.min(r5, r0)
            byte[] r0 = r2.f24684f
            int r1 = p371v5.C6552b0.f25624a
            int r1 = r2.f24685g
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.f24685g
            int r3 = r3 + r5
            r2.f24685g = r3
            int r3 = r2.f24686h
            int r3 = r3 - r5
            r2.f24686h = r3
            r2.m12952r(r5)
            return r5
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: c */
    public long mo6021c(p352u5.C6323l r8) {
            r7 = this;
            r7.m12954t(r8)
            r7.f24683e = r8
            android.net.Uri r0 = r8.f24704a
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "data"
            boolean r2 = r2.equals(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            java.lang.String r4 = "Unsupported scheme: "
            if (r3 == 0) goto L22
            java.lang.String r1 = r4.concat(r1)
            goto L27
        L22:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L27:
            p371v5.C6549a.m13289c(r2, r1)
            java.lang.String r1 = r0.getSchemeSpecificPart()
            java.lang.String r2 = ","
            java.lang.String[] r1 = p371v5.C6552b0.m13303G(r1, r2)
            int r2 = r1.length
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r2 != r3) goto Lb4
            r0 = r1[r5]
            r1 = r1[r6]
            java.lang.String r2 = ";base64"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L6b
            byte[] r1 = android.util.Base64.decode(r0, r6)     // Catch: java.lang.IllegalArgumentException -> L4e
            r7.f24684f = r1     // Catch: java.lang.IllegalArgumentException -> L4e
            goto L7b
        L4e:
            r8 = move-exception
            java.lang.String r1 = "Error while parsing Base64 encoded string: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L60
            java.lang.String r0 = r1.concat(r0)
            goto L65
        L60:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L65:
            f4.s0 r1 = new f4.s0
            r1.<init>(r0, r8, r5, r6)
            throw r1
        L6b:
            java.nio.charset.Charset r1 = p010a9.C0035c.f80a
            java.lang.String r1 = r1.name()
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)
            byte[] r0 = p371v5.C6552b0.m13329v(r0)
            r7.f24684f = r0
        L7b:
            long r0 = r8.f24709f
            byte[] r2 = r7.f24684f
            int r3 = r2.length
            long r5 = (long) r3
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 > 0) goto Laa
            int r1 = (int) r0
            r7.f24685g = r1
            int r0 = r2.length
            int r0 = r0 - r1
            r7.f24686h = r0
            long r1 = r8.f24710g
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L9c
            long r5 = (long) r0
            long r0 = java.lang.Math.min(r5, r1)
            int r1 = (int) r0
            r7.f24686h = r1
        L9c:
            r7.m12955u(r8)
            long r0 = r8.f24710g
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto La6
            goto La9
        La6:
            int r8 = r7.f24686h
            long r0 = (long) r8
        La9:
            return r0
        Laa:
            r7.f24684f = r4
            u5.j r8 = new u5.j
            r0 = 2008(0x7d8, float:2.814E-42)
            r8.<init>(r0)
            throw r8
        Lb4:
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r0 = r8.length()
            int r0 = r0 + 23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected URI format: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            f4.s0 r0 = new f4.s0
            r0.<init>(r8, r4, r5, r6)
            throw r0
    }

    @Override // p352u5.InterfaceC6320i
    public void close() {
            r2 = this;
            byte[] r0 = r2.f24684f
            r1 = 0
            if (r0 == 0) goto La
            r2.f24684f = r1
            r2.m12953s()
        La:
            r2.f24683e = r1
            return
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: l */
    public android.net.Uri mo6024l() {
            r1 = this;
            u5.l r0 = r1.f24683e
            if (r0 == 0) goto L7
            android.net.Uri r0 = r0.f24704a
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }
}
