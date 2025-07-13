package p352u5;

/* renamed from: u5.h0 */
/* loaded from: classes.dex */
public final class C6319h0 extends p352u5.AbstractC6310d {

    /* renamed from: e */
    public final int f24687e;

    /* renamed from: f */
    public final byte[] f24688f;

    /* renamed from: g */
    public final java.net.DatagramPacket f24689g;

    /* renamed from: h */
    public android.net.Uri f24690h;

    /* renamed from: i */
    public java.net.DatagramSocket f24691i;

    /* renamed from: j */
    public java.net.MulticastSocket f24692j;

    /* renamed from: k */
    public java.net.InetAddress f24693k;

    /* renamed from: l */
    public boolean f24694l;

    /* renamed from: m */
    public int f24695m;

    /* renamed from: u5.h0$a */
    public static final class a extends p352u5.C6321j {
        public a(java.lang.Throwable r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public C6319h0() {
            r4 = this;
            r0 = 1
            r4.<init>(r0)
            r0 = 8000(0x1f40, float:1.121E-41)
            r4.f24687e = r0
            r0 = 2000(0x7d0, float:2.803E-42)
            byte[] r1 = new byte[r0]
            r4.f24688f = r1
            java.net.DatagramPacket r2 = new java.net.DatagramPacket
            r3 = 0
            r2.<init>(r1, r3, r0)
            r4.f24689g = r2
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
            int r0 = r2.f24695m
            if (r0 != 0) goto L30
            java.net.DatagramSocket r0 = r2.f24691i     // Catch: java.io.IOException -> L1e java.net.SocketTimeoutException -> L27
            java.util.Objects.requireNonNull(r0)     // Catch: java.io.IOException -> L1e java.net.SocketTimeoutException -> L27
            java.net.DatagramPacket r1 = r2.f24689g     // Catch: java.io.IOException -> L1e java.net.SocketTimeoutException -> L27
            r0.receive(r1)     // Catch: java.io.IOException -> L1e java.net.SocketTimeoutException -> L27
            java.net.DatagramPacket r0 = r2.f24689g
            int r0 = r0.getLength()
            r2.f24695m = r0
            r2.m12952r(r0)
            goto L30
        L1e:
            r3 = move-exception
            u5.h0$a r4 = new u5.h0$a
            r5 = 2001(0x7d1, float:2.804E-42)
            r4.<init>(r3, r5)
            throw r4
        L27:
            r3 = move-exception
            u5.h0$a r4 = new u5.h0$a
            r5 = 2002(0x7d2, float:2.805E-42)
            r4.<init>(r3, r5)
            throw r4
        L30:
            java.net.DatagramPacket r0 = r2.f24689g
            int r0 = r0.getLength()
            int r1 = r2.f24695m
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r1, r5)
            byte[] r1 = r2.f24688f
            java.lang.System.arraycopy(r1, r0, r3, r4, r5)
            int r3 = r2.f24695m
            int r3 = r3 - r5
            r2.f24695m = r3
            return r5
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: c */
    public long mo6021c(p352u5.C6323l r4) {
            r3 = this;
            android.net.Uri r0 = r4.f24704a
            r3.f24690h = r0
            java.lang.String r0 = r0.getHost()
            java.util.Objects.requireNonNull(r0)
            android.net.Uri r1 = r3.f24690h
            int r1 = r1.getPort()
            r3.m12954t(r4)
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r3.f24693k = r0     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            java.net.InetAddress r2 = r3.f24693k     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r0.<init>(r2, r1)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            java.net.InetAddress r1 = r3.f24693k     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            boolean r1 = r1.isMulticastAddress()     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            if (r1 == 0) goto L3a
            java.net.MulticastSocket r1 = new java.net.MulticastSocket     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r1.<init>(r0)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r3.f24692j = r1     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            java.net.InetAddress r0 = r3.f24693k     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r1.joinGroup(r0)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            java.net.MulticastSocket r0 = r3.f24692j     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r3.f24691i = r0     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            goto L41
        L3a:
            java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r1.<init>(r0)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r3.f24691i = r1     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
        L41:
            java.net.DatagramSocket r0 = r3.f24691i     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            int r1 = r3.f24687e     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r0.setSoTimeout(r1)     // Catch: java.io.IOException -> L51 java.lang.SecurityException -> L5a
            r0 = 1
            r3.f24694l = r0
            r3.m12955u(r4)
            r0 = -1
            return r0
        L51:
            r4 = move-exception
            u5.h0$a r0 = new u5.h0$a
            r1 = 2001(0x7d1, float:2.804E-42)
            r0.<init>(r4, r1)
            throw r0
        L5a:
            r4 = move-exception
            u5.h0$a r0 = new u5.h0$a
            r1 = 2006(0x7d6, float:2.811E-42)
            r0.<init>(r4, r1)
            throw r0
    }

    @Override // p352u5.InterfaceC6320i
    public void close() {
            r3 = this;
            r0 = 0
            r3.f24690h = r0
            java.net.MulticastSocket r1 = r3.f24692j
            if (r1 == 0) goto L11
            java.net.InetAddress r2 = r3.f24693k     // Catch: java.io.IOException -> Lf
            java.util.Objects.requireNonNull(r2)     // Catch: java.io.IOException -> Lf
            r1.leaveGroup(r2)     // Catch: java.io.IOException -> Lf
        Lf:
            r3.f24692j = r0
        L11:
            java.net.DatagramSocket r1 = r3.f24691i
            if (r1 == 0) goto L1a
            r1.close()
            r3.f24691i = r0
        L1a:
            r3.f24693k = r0
            r0 = 0
            r3.f24695m = r0
            boolean r1 = r3.f24694l
            if (r1 == 0) goto L28
            r3.f24694l = r0
            r3.m12953s()
        L28:
            return
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: l */
    public android.net.Uri mo6024l() {
            r1 = this;
            android.net.Uri r0 = r1.f24690h
            return r0
    }
}
