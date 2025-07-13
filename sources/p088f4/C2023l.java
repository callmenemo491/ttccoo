package p088f4;

/* renamed from: f4.l */
/* loaded from: classes.dex */
public class C2023l implements p088f4.InterfaceC2015i0 {

    /* renamed from: a */
    public final p352u5.C6324m f9164a;

    /* renamed from: b */
    public final long f9165b;

    /* renamed from: c */
    public final long f9166c;

    /* renamed from: d */
    public final long f9167d;

    /* renamed from: e */
    public final long f9168e;

    /* renamed from: f */
    public final int f9169f;

    /* renamed from: g */
    public final long f9170g;

    /* renamed from: h */
    public int f9171h;

    /* renamed from: i */
    public boolean f9172i;

    public C2023l() {
            r9 = this;
            u5.m r0 = new u5.m
            r1 = 1
            r2 = 65536(0x10000, float:9.1835E-41)
            r0.<init>(r1, r2)
            r9.<init>()
            r1 = 2500(0x9c4, float:3.503E-42)
            r2 = 0
            java.lang.String r3 = "bufferForPlaybackMs"
            java.lang.String r4 = "0"
            m5315j(r1, r2, r3, r4)
            r5 = 5000(0x1388, float:7.006E-42)
            java.lang.String r6 = "bufferForPlaybackAfterRebufferMs"
            m5315j(r5, r2, r6, r4)
            r7 = 50000(0xc350, float:7.0065E-41)
            java.lang.String r8 = "minBufferMs"
            m5315j(r7, r1, r8, r3)
            m5315j(r7, r5, r8, r6)
            java.lang.String r3 = "maxBufferMs"
            m5315j(r7, r7, r3, r8)
            java.lang.String r3 = "backBufferDurationMs"
            m5315j(r2, r2, r3, r4)
            r9.f9164a = r0
            long r3 = (long) r7
            long r6 = p371v5.C6552b0.m13297A(r3)
            r9.f9165b = r6
            long r3 = p371v5.C6552b0.m13297A(r3)
            r9.f9166c = r3
            long r0 = (long) r1
            long r0 = p371v5.C6552b0.m13297A(r0)
            r9.f9167d = r0
            long r0 = (long) r5
            long r0 = p371v5.C6552b0.m13297A(r0)
            r9.f9168e = r0
            r0 = -1
            r9.f9169f = r0
            r0 = 13107200(0xc80000, float:1.8367099E-38)
            r9.f9171h = r0
            long r0 = (long) r2
            long r0 = p371v5.C6552b0.m13297A(r0)
            r9.f9170g = r0
            return
    }

    /* renamed from: j */
    public static void m5315j(int r1, int r2, java.lang.String r3, java.lang.String r4) {
            if (r1 < r2) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            int r2 = r3.length()
            int r2 = r2 + 21
            int r0 = r4.length()
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r3 = " cannot be less than "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            p371v5.C6549a.m13289c(r1, r2)
            return
    }

    @Override // p088f4.InterfaceC2015i0
    /* renamed from: a */
    public boolean mo5253a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p088f4.InterfaceC2015i0
    /* renamed from: b */
    public void mo5254b() {
            r1 = this;
            r0 = 1
            r1.m5316k(r0)
            return
    }

    @Override // p088f4.InterfaceC2015i0
    /* renamed from: c */
    public boolean mo5255c(long r4, float r6, boolean r7, long r8) {
            r3 = this;
            int r0 = p371v5.C6552b0.f25624a
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            goto L10
        L9:
            double r4 = (double) r4
            double r0 = (double) r6
            double r4 = r4 / r0
            long r4 = java.lang.Math.round(r4)
        L10:
            if (r7 == 0) goto L15
            long r6 = r3.f9168e
            goto L17
        L15:
            long r6 = r3.f9167d
        L17:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L27
            r0 = 2
            long r8 = r8 / r0
            long r6 = java.lang.Math.min(r8, r6)
        L27:
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L45
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L45
            u5.m r4 = r3.f9164a
            monitor-enter(r4)
            int r5 = r4.f24718e     // Catch: java.lang.Throwable -> L42
            int r6 = r4.f24715b     // Catch: java.lang.Throwable -> L42
            int r5 = r5 * r6
            monitor-exit(r4)
            int r4 = r3.f9171h
            if (r5 < r4) goto L40
            goto L45
        L40:
            r4 = 0
            goto L46
        L42:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L45:
            r4 = 1
        L46:
            return r4
    }

    @Override // p088f4.InterfaceC2015i0
    /* renamed from: d */
    public boolean mo5256d(long r7, long r9, float r11) {
            r6 = this;
            u5.m r7 = r6.f9164a
            monitor-enter(r7)
            int r8 = r7.f24718e     // Catch: java.lang.Throwable -> L51
            int r0 = r7.f24715b     // Catch: java.lang.Throwable -> L51
            int r8 = r8 * r0
            monitor-exit(r7)
            int r7 = r6.f9171h
            r0 = 1
            r1 = 0
            if (r8 < r7) goto L12
            r7 = 1
            goto L13
        L12:
            r7 = 0
        L13:
            long r2 = r6.f9165b
            r8 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r8 <= 0) goto L25
            long r2 = p371v5.C6552b0.m13324q(r2, r11)
            long r4 = r6.f9166c
            long r2 = java.lang.Math.min(r2, r4)
        L25:
            r4 = 500000(0x7a120, double:2.47033E-318)
            long r2 = java.lang.Math.max(r2, r4)
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 >= 0) goto L44
            if (r7 != 0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            r6.f9172i = r0
            if (r0 != 0) goto L4e
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 >= 0) goto L4e
            java.lang.String r7 = "DefaultLoadControl"
            java.lang.String r8 = "Target buffer size reached with less than 500ms of buffered media data."
            android.util.Log.w(r7, r8)
            goto L4e
        L44:
            long r2 = r6.f9166c
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 >= 0) goto L4c
            if (r7 == 0) goto L4e
        L4c:
            r6.f9172i = r1
        L4e:
            boolean r7 = r6.f9172i
            return r7
        L51:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    @Override // p088f4.InterfaceC2015i0
    /* renamed from: e */
    public p352u5.C6324m mo5257e() {
            r1 = this;
            u5.m r0 = r1.f9164a
            return r0
    }

    @Override // p088f4.InterfaceC2015i0
    /* renamed from: f */
    public void mo5258f() {
            r1 = this;
            r0 = 1
            r1.m5316k(r0)
            return
    }

    @Override // p088f4.InterfaceC2015i0
    /* renamed from: g */
    public void mo5259g(p088f4.InterfaceC2004e1[] r5, p108g5.C2273i0 r6, p325s5.InterfaceC5966f[] r7) {
            r4 = this;
            int r6 = r4.f9169f
            r0 = -1
            if (r6 != r0) goto L32
            r6 = 0
            r0 = 0
            r1 = 0
        L8:
            int r2 = r5.length
            r3 = 13107200(0xc80000, float:1.8367099E-38)
            if (r0 >= r2) goto L2e
            r2 = r7[r0]
            if (r2 == 0) goto L2b
            r2 = r5[r0]
            int r2 = r2.mo5212w()
            switch(r2) {
                case -2: goto L29;
                case -1: goto L1a;
                case 0: goto L26;
                case 1: goto L2a;
                case 2: goto L23;
                case 3: goto L20;
                case 4: goto L20;
                case 5: goto L20;
                case 6: goto L20;
                default: goto L1a;
            }
        L1a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L20:
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L2a
        L23:
            r3 = 131072000(0x7d00000, float:3.1296362E-34)
            goto L2a
        L26:
            r3 = 144310272(0x89a0000, float:9.268538E-34)
            goto L2a
        L29:
            r3 = 0
        L2a:
            int r1 = r1 + r3
        L2b:
            int r0 = r0 + 1
            goto L8
        L2e:
            int r6 = java.lang.Math.max(r3, r1)
        L32:
            r4.f9171h = r6
            u5.m r5 = r4.f9164a
            r5.m12967b(r6)
            return
    }

    @Override // p088f4.InterfaceC2015i0
    /* renamed from: h */
    public long mo5260h() {
            r2 = this;
            long r0 = r2.f9170g
            return r0
    }

    @Override // p088f4.InterfaceC2015i0
    /* renamed from: i */
    public void mo5261i() {
            r1 = this;
            r0 = 0
            r1.m5316k(r0)
            return
    }

    /* renamed from: k */
    public final void m5316k(boolean r3) {
            r2 = this;
            int r0 = r2.f9169f
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 13107200(0xc80000, float:1.8367099E-38)
        L7:
            r2.f9171h = r0
            r0 = 0
            r2.f9172i = r0
            if (r3 == 0) goto L1d
            u5.m r3 = r2.f9164a
            monitor-enter(r3)
            boolean r1 = r3.f24714a     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L18
            r3.m12967b(r0)     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r3)
            goto L1d
        L1a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L1d:
            return
    }
}
