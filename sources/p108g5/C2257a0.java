package p108g5;

/* renamed from: g5.a0 */
/* loaded from: classes.dex */
public class C2257a0 {

    /* renamed from: a */
    public final p352u5.C6324m f10261a;

    /* renamed from: b */
    public final int f10262b;

    /* renamed from: c */
    public final p371v5.C6571u f10263c;

    /* renamed from: d */
    public p108g5.C2257a0.a f10264d;

    /* renamed from: e */
    public p108g5.C2257a0.a f10265e;

    /* renamed from: f */
    public p108g5.C2257a0.a f10266f;

    /* renamed from: g */
    public long f10267g;

    /* renamed from: g5.a0$a */
    public static final class a {

        /* renamed from: a */
        public final long f10268a;

        /* renamed from: b */
        public final long f10269b;

        /* renamed from: c */
        public boolean f10270c;

        /* renamed from: d */
        public p352u5.C6304a f10271d;

        /* renamed from: e */
        public p108g5.C2257a0.a f10272e;

        public a(long r3, int r5) {
                r2 = this;
                r2.<init>()
                r2.f10268a = r3
                long r0 = (long) r5
                long r3 = r3 + r0
                r2.f10269b = r3
                return
        }

        /* renamed from: a */
        public int m5950a(long r3) {
                r2 = this;
                long r0 = r2.f10268a
                long r3 = r3 - r0
                int r4 = (int) r3
                u5.a r3 = r2.f10271d
                int r3 = r3.f24620b
                int r4 = r4 + r3
                return r4
        }
    }

    public C2257a0(p352u5.C6324m r4) {
            r3 = this;
            r3.<init>()
            r3.f10261a = r4
            int r4 = r4.f24715b
            r3.f10262b = r4
            v5.u r0 = new v5.u
            r1 = 32
            r0.<init>(r1)
            r3.f10263c = r0
            g5.a0$a r0 = new g5.a0$a
            r1 = 0
            r0.<init>(r1, r4)
            r3.f10264d = r0
            r3.f10265e = r0
            r3.f10266f = r0
            return
    }

    /* renamed from: d */
    public static p108g5.C2257a0.a m5944d(p108g5.C2257a0.a r3, long r4, java.nio.ByteBuffer r6, int r7) {
        L0:
            long r0 = r3.f10269b
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            g5.a0$a r3 = r3.f10272e
            goto L0
        L9:
            if (r7 <= 0) goto L2a
            long r0 = r3.f10269b
            long r0 = r0 - r4
            int r1 = (int) r0
            int r0 = java.lang.Math.min(r7, r1)
            u5.a r1 = r3.f10271d
            byte[] r1 = r1.f24619a
            int r2 = r3.m5950a(r4)
            r6.put(r1, r2, r0)
            int r7 = r7 - r0
            long r0 = (long) r0
            long r4 = r4 + r0
            long r0 = r3.f10269b
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L9
            g5.a0$a r3 = r3.f10272e
            goto L9
        L2a:
            return r3
    }

    /* renamed from: e */
    public static p108g5.C2257a0.a m5945e(p108g5.C2257a0.a r5, long r6, byte[] r8, int r9) {
        L0:
            long r0 = r5.f10269b
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            g5.a0$a r5 = r5.f10272e
            goto L0
        L9:
            r0 = r9
        La:
            if (r0 <= 0) goto L2d
            long r1 = r5.f10269b
            long r1 = r1 - r6
            int r2 = (int) r1
            int r1 = java.lang.Math.min(r0, r2)
            u5.a r2 = r5.f10271d
            byte[] r2 = r2.f24619a
            int r3 = r5.m5950a(r6)
            int r4 = r9 - r0
            java.lang.System.arraycopy(r2, r3, r8, r4, r1)
            int r0 = r0 - r1
            long r1 = (long) r1
            long r6 = r6 + r1
            long r1 = r5.f10269b
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 != 0) goto La
            g5.a0$a r5 = r5.f10272e
            goto La
        L2d:
            return r5
    }

    /* renamed from: f */
    public static p108g5.C2257a0.a m5946f(p108g5.C2257a0.a r12, p142i4.C3073g r13, p108g5.C2259b0.b r14, p371v5.C6571u r15) {
            boolean r0 = r13.m7526x()
            if (r0 == 0) goto Ldf
            long r0 = r14.f10312b
            r2 = 1
            r15.m13392B(r2)
            byte[] r3 = r15.f25710a
            g5.a0$a r12 = m5945e(r12, r0, r3, r2)
            r3 = 1
            long r0 = r0 + r3
            byte[] r3 = r15.f25710a
            r4 = 0
            r3 = r3[r4]
            r5 = r3 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            i4.c r6 = r13.f12357Z
            byte[] r7 = r6.f12334a
            if (r7 != 0) goto L30
            r7 = 16
            byte[] r7 = new byte[r7]
            r6.f12334a = r7
            goto L33
        L30:
            java.util.Arrays.fill(r7, r4)
        L33:
            byte[] r7 = r6.f12334a
            g5.a0$a r12 = m5945e(r12, r0, r7, r3)
            long r7 = (long) r3
            long r0 = r0 + r7
            if (r5 == 0) goto L4e
            r2 = 2
            r15.m13392B(r2)
            byte[] r3 = r15.f25710a
            g5.a0$a r12 = m5945e(r12, r0, r3, r2)
            r2 = 2
            long r0 = r0 + r2
            int r2 = r15.m13423z()
        L4e:
            int[] r3 = r6.f12337d
            if (r3 == 0) goto L55
            int r7 = r3.length
            if (r7 >= r2) goto L57
        L55:
            int[] r3 = new int[r2]
        L57:
            int[] r7 = r6.f12338e
            if (r7 == 0) goto L5e
            int r8 = r7.length
            if (r8 >= r2) goto L60
        L5e:
            int[] r7 = new int[r2]
        L60:
            if (r5 == 0) goto L83
            int r5 = r2 * 6
            r15.m13392B(r5)
            byte[] r8 = r15.f25710a
            g5.a0$a r12 = m5945e(r12, r0, r8, r5)
            long r8 = (long) r5
            long r0 = r0 + r8
            r15.m13396F(r4)
        L72:
            if (r4 >= r2) goto L8f
            int r5 = r15.m13423z()
            r3[r4] = r5
            int r5 = r15.m13421x()
            r7[r4] = r5
            int r4 = r4 + 1
            goto L72
        L83:
            r3[r4] = r4
            int r5 = r14.f10311a
            long r8 = r14.f10312b
            long r8 = r0 - r8
            int r9 = (int) r8
            int r5 = r5 - r9
            r7[r4] = r5
        L8f:
            m4.z$a r4 = r14.f10313c
            int r5 = p371v5.C6552b0.f25624a
            byte[] r5 = r4.f17943b
            byte[] r8 = r6.f12334a
            int r9 = r4.f17942a
            int r10 = r4.f17944c
            int r4 = r4.f17945d
            r6.f12339f = r2
            r6.f12337d = r3
            r6.f12338e = r7
            r6.f12335b = r5
            r6.f12334a = r8
            r6.f12336c = r9
            r6.f12340g = r10
            r6.f12341h = r4
            android.media.MediaCodec$CryptoInfo r11 = r6.f12342i
            r11.numSubSamples = r2
            r11.numBytesOfClearData = r3
            r11.numBytesOfEncryptedData = r7
            r11.key = r5
            r11.iv = r8
            r11.mode = r9
            int r2 = p371v5.C6552b0.f25624a
            r3 = 24
            if (r2 < r3) goto Ld2
            i4.c$b r2 = r6.f12343j
            java.util.Objects.requireNonNull(r2)
            android.media.MediaCodec$CryptoInfo$Pattern r3 = r2.f12345b
            r3.set(r10, r4)
            android.media.MediaCodec$CryptoInfo r3 = r2.f12344a
            android.media.MediaCodec$CryptoInfo$Pattern r2 = r2.f12345b
            r3.setPattern(r2)
        Ld2:
            long r2 = r14.f10312b
            long r0 = r0 - r2
            int r1 = (int) r0
            long r4 = (long) r1
            long r2 = r2 + r4
            r14.f10312b = r2
            int r0 = r14.f10311a
            int r0 = r0 - r1
            r14.f10311a = r0
        Ldf:
            boolean r0 = r13.m7515p()
            if (r0 == 0) goto L133
            r0 = 4
            r15.m13392B(r0)
            long r1 = r14.f10312b
            byte[] r3 = r15.f25710a
            g5.a0$a r12 = m5945e(r12, r1, r3, r0)
            int r15 = r15.m13421x()
            long r1 = r14.f10312b
            r3 = 4
            long r1 = r1 + r3
            r14.f10312b = r1
            int r1 = r14.f10311a
            int r1 = r1 - r0
            r14.f10311a = r1
            r13.m7524v(r15)
            long r0 = r14.f10312b
            java.nio.ByteBuffer r2 = r13.f12358a0
            g5.a0$a r12 = m5944d(r12, r0, r2, r15)
            long r0 = r14.f10312b
            long r2 = (long) r15
            long r0 = r0 + r2
            r14.f10312b = r0
            int r0 = r14.f10311a
            int r0 = r0 - r15
            r14.f10311a = r0
            java.nio.ByteBuffer r15 = r13.f12361d0
            if (r15 == 0) goto L128
            int r15 = r15.capacity()
            if (r15 >= r0) goto L122
            goto L128
        L122:
            java.nio.ByteBuffer r15 = r13.f12361d0
            r15.clear()
            goto L12e
        L128:
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.allocate(r0)
            r13.f12361d0 = r15
        L12e:
            long r0 = r14.f10312b
            java.nio.ByteBuffer r13 = r13.f12361d0
            goto L13c
        L133:
            int r15 = r14.f10311a
            r13.m7524v(r15)
            long r0 = r14.f10312b
            java.nio.ByteBuffer r13 = r13.f12358a0
        L13c:
            int r14 = r14.f10311a
            g5.a0$a r12 = m5944d(r12, r0, r13, r14)
            return r12
    }

    /* renamed from: a */
    public void m5947a(long r5) {
            r4 = this;
            r0 = -1
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            g5.a0$a r0 = r4.f10264d
            long r1 = r0.f10269b
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 < 0) goto L2c
            u5.m r1 = r4.f10261a
            u5.a r0 = r0.f10271d
            monitor-enter(r1)
            u5.a[] r2 = r1.f24716c     // Catch: java.lang.Throwable -> L29
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> L29
            r1.m12966a(r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)
            g5.a0$a r0 = r4.f10264d
            r1 = 0
            r0.f10271d = r1
            g5.a0$a r2 = r0.f10272e
            r0.f10272e = r1
            r4.f10264d = r2
            goto L7
        L29:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L2c:
            g5.a0$a r5 = r4.f10265e
            long r5 = r5.f10268a
            long r1 = r0.f10268a
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L38
            r4.f10265e = r0
        L38:
            return
    }

    /* renamed from: b */
    public final void m5948b(int r6) {
            r5 = this;
            long r0 = r5.f10267g
            long r2 = (long) r6
            long r0 = r0 + r2
            r5.f10267g = r0
            g5.a0$a r6 = r5.f10266f
            long r2 = r6.f10269b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L12
            g5.a0$a r6 = r6.f10272e
            r5.f10266f = r6
        L12:
            return
    }

    /* renamed from: c */
    public final int m5949c(int r8) {
            r7 = this;
            g5.a0$a r0 = r7.f10266f
            boolean r1 = r0.f10270c
            if (r1 != 0) goto L46
            u5.m r1 = r7.f10261a
            monitor-enter(r1)
            int r2 = r1.f24718e     // Catch: java.lang.Throwable -> L43
            r3 = 1
            int r2 = r2 + r3
            r1.f24718e = r2     // Catch: java.lang.Throwable -> L43
            int r2 = r1.f24719f     // Catch: java.lang.Throwable -> L43
            if (r2 <= 0) goto L26
            u5.a[] r4 = r1.f24720g     // Catch: java.lang.Throwable -> L43
            int r2 = r2 + (-1)
            r1.f24719f = r2     // Catch: java.lang.Throwable -> L43
            r2 = r4[r2]     // Catch: java.lang.Throwable -> L43
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L43
            u5.a[] r4 = r1.f24720g     // Catch: java.lang.Throwable -> L43
            int r5 = r1.f24719f     // Catch: java.lang.Throwable -> L43
            r6 = 0
            r4[r5] = r6     // Catch: java.lang.Throwable -> L43
            goto L30
        L26:
            u5.a r2 = new u5.a     // Catch: java.lang.Throwable -> L43
            int r4 = r1.f24715b     // Catch: java.lang.Throwable -> L43
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L43
            r5 = 0
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L43
        L30:
            monitor-exit(r1)
            g5.a0$a r1 = new g5.a0$a
            g5.a0$a r4 = r7.f10266f
            long r4 = r4.f10269b
            int r6 = r7.f10262b
            r1.<init>(r4, r6)
            r0.f10271d = r2
            r0.f10272e = r1
            r0.f10270c = r3
            goto L46
        L43:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        L46:
            g5.a0$a r0 = r7.f10266f
            long r0 = r0.f10269b
            long r2 = r7.f10267g
            long r0 = r0 - r2
            int r1 = (int) r0
            int r8 = java.lang.Math.min(r8, r1)
            return r8
    }
}
