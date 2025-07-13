package p142i4;

/* renamed from: i4.g */
/* loaded from: classes.dex */
public class C3073g extends p142i4.AbstractC3067a {

    /* renamed from: Z */
    public final p142i4.C3069c f12357Z;

    /* renamed from: a0 */
    public java.nio.ByteBuffer f12358a0;

    /* renamed from: b0 */
    public boolean f12359b0;

    /* renamed from: c0 */
    public long f12360c0;

    /* renamed from: d0 */
    public java.nio.ByteBuffer f12361d0;

    /* renamed from: e0 */
    public final int f12362e0;

    /* renamed from: f0 */
    public final int f12363f0;

    /* renamed from: i4.g$a */
    public static final class a extends java.lang.IllegalStateException {
        public a(int r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 44
                r0.<init>(r1)
                java.lang.String r1 = "Buffer too small ("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " < "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = ")"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    static {
            java.lang.String r0 = "goog.exo.decoder"
            p088f4.C1997c0.m5181a(r0)
            return
    }

    public C3073g(int r2) {
            r1 = this;
            r1.<init>()
            i4.c r0 = new i4.c
            r0.<init>()
            r1.f12357Z = r0
            r1.f12362e0 = r2
            r2 = 0
            r1.f12363f0 = r2
            return
    }

    /* renamed from: t */
    public void mo7522t() {
            r2 = this;
            r0 = 0
            r2.f12333Y = r0
            java.nio.ByteBuffer r1 = r2.f12358a0
            if (r1 == 0) goto La
            r1.clear()
        La:
            java.nio.ByteBuffer r1 = r2.f12361d0
            if (r1 == 0) goto L11
            r1.clear()
        L11:
            r2.f12359b0 = r0
            return
    }

    /* renamed from: u */
    public final java.nio.ByteBuffer m7523u(int r3) {
            r2 = this;
            int r0 = r2.f12362e0
            r1 = 1
            if (r0 != r1) goto La
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            return r3
        La:
            r1 = 2
            if (r0 != r1) goto L12
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)
            return r3
        L12:
            java.nio.ByteBuffer r0 = r2.f12358a0
            if (r0 != 0) goto L18
            r0 = 0
            goto L1c
        L18:
            int r0 = r0.capacity()
        L1c:
            i4.g$a r1 = new i4.g$a
            r1.<init>(r0, r3)
            throw r1
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"data"})
    /* renamed from: v */
    public void m7524v(int r4) {
            r3 = this;
            int r0 = r3.f12363f0
            int r4 = r4 + r0
            java.nio.ByteBuffer r0 = r3.f12358a0
            if (r0 != 0) goto Le
            java.nio.ByteBuffer r4 = r3.m7523u(r4)
            r3.f12358a0 = r4
            return
        Le:
            int r1 = r0.capacity()
            int r2 = r0.position()
            int r4 = r4 + r2
            if (r1 < r4) goto L1c
            r3.f12358a0 = r0
            return
        L1c:
            java.nio.ByteBuffer r4 = r3.m7523u(r4)
            java.nio.ByteOrder r1 = r0.order()
            r4.order(r1)
            if (r2 <= 0) goto L2f
            r0.flip()
            r4.put(r0)
        L2f:
            r3.f12358a0 = r4
            return
    }

    /* renamed from: w */
    public final void m7525w() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f12358a0
            if (r0 == 0) goto L7
            r0.flip()
        L7:
            java.nio.ByteBuffer r0 = r1.f12361d0
            if (r0 == 0) goto Le
            r0.flip()
        Le:
            return
    }

    /* renamed from: x */
    public final boolean m7526x() {
            r1 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r1.m7514o(r0)
            return r0
    }
}
