package cd;

/* renamed from: cd.c */
/* loaded from: classes.dex */
public final class C0948c implements bd.InterfaceC0733a {

    /* renamed from: a */
    public final cd.C0949d f4938a;

    /* renamed from: b */
    public final cd.C0946a f4939b;

    /* renamed from: c */
    public final p124h7.C2839rb f4940c;

    /* renamed from: d */
    public final cd.C0947b f4941d;

    public C0948c(int r5) {
            r4 = this;
            r4.<init>()
            cd.d r0 = new cd.d
            r0.<init>()
            r4.f4938a = r0
            cd.a r0 = new cd.a
            r0.<init>()
            r4.f4939b = r0
            h7.rb r0 = new h7.rb
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2)
            r4.f4940c = r0
            r0 = r2 & r2
            if (r0 == 0) goto L24
            ed.a r0 = new ed.a
            r0.<init>()
            goto L25
        L24:
            r0 = r1
        L25:
            java.lang.String r2 = "hexWriter"
            p214m2.C4339q.m9707l(r0, r2)
            cd.b r0 = new cd.b
            r2 = 0
            r3 = 6
            r0.<init>(r5, r1, r2, r3)
            r4.f4941d = r0
            return
    }

    @Override // bd.InterfaceC0733a
    /* renamed from: a */
    public void mo2338a(byte[] r4) {
            r3 = this;
            java.lang.String r0 = "value"
            p214m2.C4339q.m9707l(r4, r0)
            cd.b r0 = r3.f4941d
            r1 = 0
            r2 = 6
            cd.C0947b.m2670b(r0, r4, r1, r1, r2)
            return
    }

    @Override // bd.InterfaceC0733a
    /* renamed from: b */
    public void mo2339b(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "value"
            p214m2.C4339q.m9707l(r3, r0)
            cd.a r0 = r2.f4939b
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = "name"
            p214m2.C4339q.m9707l(r3, r0)
            java.lang.String r0 = "writer"
            p214m2.C4339q.m9707l(r2, r0)
            int r0 = r3.length()
            r1 = 12
            if (r0 > r1) goto L20
            r2.mo2340c(r3)
            return
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Account name cannot be more than 12 characters. => "
            java.lang.String r3 = p064e.C1493g.m4049a(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // bd.InterfaceC0733a
    /* renamed from: c */
    public void mo2340c(java.lang.String r13) {
            r12 = this;
            cd.d r0 = r12.f4938a
            java.util.Objects.requireNonNull(r0)
            int r0 = r13.length()
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = 0
        Le:
            r7 = 12
            if (r4 > r7) goto L51
            if (r4 >= r0) goto L3a
            if (r4 > r7) goto L3a
            char r8 = r13.charAt(r4)
            r9 = 97
            if (r9 <= r8) goto L1f
            goto L28
        L1f:
            r9 = 122(0x7a, float:1.71E-43)
            if (r9 < r8) goto L28
            int r8 = r8 + (-97)
            int r8 = r8 + 6
            goto L37
        L28:
            r9 = 53
            r10 = 49
            if (r10 <= r8) goto L2f
            goto L36
        L2f:
            if (r9 < r8) goto L36
            int r8 = r8 + (-49)
            int r8 = r8 + 1
            goto L37
        L36:
            r8 = 0
        L37:
            byte r8 = (byte) r8
            long r8 = (long) r8
            goto L3b
        L3a:
            r8 = r1
        L3b:
            if (r4 >= r7) goto L49
            r10 = 31
            long r7 = r8 & r10
            int r9 = r4 + 1
            int r9 = r9 * 5
            int r9 = 64 - r9
            long r7 = r7 << r9
            goto L4d
        L49:
            r10 = 15
            long r7 = r8 & r10
        L4d:
            long r5 = r5 | r7
            int r4 = r4 + 1
            goto Le
        L51:
            r12.mo2347j(r5)
            return
    }

    @Override // bd.InterfaceC0733a
    /* renamed from: d */
    public byte[] mo2341d() {
            r4 = this;
            cd.b r0 = r4.f4941d
            int r1 = r0.f4937b
            byte[] r2 = new byte[r1]
            if (r1 <= 0) goto Le
            byte[] r0 = r0.f4936a
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r2, r3, r1)
        Le:
            return r2
    }

    @Override // bd.InterfaceC0733a
    /* renamed from: e */
    public void mo2342e(long r5) {
            r4 = this;
        L0:
            r0 = 128(0x80, float:1.8E-43)
            long r0 = (long) r0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L17
            r0 = 127(0x7f, double:6.27E-322)
            long r0 = r0 & r5
            r2 = 128(0x80, double:6.3E-322)
            long r0 = r0 | r2
            int r1 = (int) r0
            byte r0 = (byte) r1
            cd.b r1 = r4.f4941d
            r1.m2671a(r0)
            r0 = 7
            long r5 = r5 >>> r0
            goto L0
        L17:
            cd.b r0 = r4.f4941d
            int r6 = (int) r5
            byte r5 = (byte) r6
            r0.m2671a(r5)
            return
    }

    @Override // bd.InterfaceC0733a
    /* renamed from: f */
    public void mo2343f(float r4) {
            r3 = this;
            cd.b r0 = r3.f4941d
            java.util.Objects.requireNonNull(r0)
            r1 = 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            java.nio.ByteBuffer r4 = r1.putFloat(r4)
            byte[] r4 = r4.array()
            java.lang.String r1 = "this"
            p214m2.C4339q.m9703h(r4, r1)
            r1 = 0
            r2 = 6
            cd.C0947b.m2670b(r0, r4, r1, r1, r2)
            return
    }

    @Override // bd.InterfaceC0733a
    /* renamed from: g */
    public void mo2344g(short r4) {
            r3 = this;
            cd.b r0 = r3.f4941d
            java.util.Objects.requireNonNull(r0)
            r1 = 2
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            java.nio.ByteBuffer r4 = r1.putShort(r4)
            byte[] r4 = r4.array()
            java.lang.String r1 = "this"
            p214m2.C4339q.m9703h(r4, r1)
            r1 = 0
            r2 = 6
            cd.C0947b.m2670b(r0, r4, r1, r1, r2)
            return
    }

    @Override // bd.InterfaceC0733a
    /* renamed from: h */
    public void mo2345h(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "value"
            p214m2.C4339q.m9707l(r8, r0)
            h7.rb r0 = r7.f4940c
            java.util.Objects.requireNonNull(r0)
            java.lang.String r1 = "asset"
            p214m2.C4339q.m9707l(r8, r1)
            java.lang.String r1 = "writer"
            p214m2.C4339q.m9707l(r7, r1)
            java.lang.CharSequence r8 = p362uh.C6467m.m13083n0(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r1 = "^([0-9]+)\\.?([0-9]*)([ ][a-zA-Z0-9]{1,7})?$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r8 = r1.matcher(r8)
            boolean r1 = r8.find()
            if (r1 == 0) goto L85
            r1 = 1
            java.lang.String r2 = r8.group(r1)
            r3 = 2
            java.lang.String r3 = r8.group(r3)
            r4 = 3
            java.lang.String r5 = r8.group(r4)
            java.lang.String r6 = "matcher.group(3)"
            p214m2.C4339q.m9703h(r5, r6)
            int r5 = r5.length()
            if (r5 != 0) goto L47
            goto L48
        L47:
            r1 = 0
        L48:
            if (r1 == 0) goto L4c
            r8 = 0
            goto L5b
        L4c:
            java.lang.String r8 = r8.group(r4)
            p214m2.C4339q.m9703h(r8, r6)
            java.lang.CharSequence r8 = p362uh.C6467m.m13083n0(r8)
            java.lang.String r8 = r8.toString()
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            long r1 = java.lang.Long.parseLong(r1)
            r7.mo2347j(r1)
            if (r8 == 0) goto L7f
            java.lang.Object r0 = r0.f11884Z
            y.e r0 = (p422y.C7095e) r0
            int r1 = r3.length()
            r0.m14213g(r1, r8, r7)
            goto L84
        L7f:
            r0 = 0
            r7.mo2347j(r0)
        L84:
            return
        L85:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid asset format"
            r8.<init>(r0)
            throw r8
    }

    @Override // bd.InterfaceC0733a
    /* renamed from: i */
    public void mo2346i(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "value"
            p214m2.C4339q.m9707l(r6, r0)
            java.nio.charset.Charset r0 = p362uh.C6455a.f25034b
            byte[] r1 = r6.getBytes(r0)
            java.lang.String r2 = "(this as java.lang.String).getBytes(charset)"
            p214m2.C4339q.m9703h(r1, r2)
            int r1 = r1.length
            long r3 = (long) r1
            r5.mo2342e(r3)
            cd.b r1 = r5.f4941d
            byte[] r6 = r6.getBytes(r0)
            p214m2.C4339q.m9703h(r6, r2)
            r0 = 0
            r2 = 6
            cd.C0947b.m2670b(r1, r6, r0, r0, r2)
            return
    }

    @Override // bd.InterfaceC0733a
    /* renamed from: j */
    public void mo2347j(long r4) {
            r3 = this;
            cd.b r0 = r3.f4941d
            java.util.Objects.requireNonNull(r0)
            r1 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            java.nio.ByteBuffer r4 = r1.putLong(r4)
            byte[] r4 = r4.array()
            java.lang.String r5 = "this"
            p214m2.C4339q.m9703h(r4, r5)
            r5 = 0
            r1 = 6
            cd.C0947b.m2670b(r0, r4, r5, r5, r1)
            return
    }
}
