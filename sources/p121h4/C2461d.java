package p121h4;

/* renamed from: h4.d */
/* loaded from: classes.dex */
public final class C2461d implements p088f4.InterfaceC2014i {

    /* renamed from: d0 */
    public static final p121h4.C2461d f11003d0 = null;

    /* renamed from: Y */
    public final int f11004Y;

    /* renamed from: Z */
    public final int f11005Z;

    /* renamed from: a0 */
    public final int f11006a0;

    /* renamed from: b0 */
    public final int f11007b0;

    /* renamed from: c0 */
    public android.media.AudioAttributes f11008c0;

    /* renamed from: h4.d$a */
    public static /* synthetic */ class a {
    }

    static {
            r2 = 0
            r4 = 1
            h4.d r6 = new h4.d
            r5 = 0
            r0 = r6
            r1 = r2
            r3 = r4
            r0.<init>(r1, r2, r3, r4, r5)
            p121h4.C2461d.f11003d0 = r6
            return
    }

    public C2461d(int r1, int r2, int r3, int r4, p121h4.C2461d.a r5) {
            r0 = this;
            r0.<init>()
            r0.f11004Y = r1
            r0.f11005Z = r2
            r0.f11006a0 = r3
            r0.f11007b0 = r4
            return
    }

    /* renamed from: b */
    public static java.lang.String m6255b(int r1) {
            r0 = 36
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            return r1
    }

    /* renamed from: a */
    public android.media.AudioAttributes m6256a() {
            r3 = this;
            android.media.AudioAttributes r0 = r3.f11008c0
            if (r0 != 0) goto L2c
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
            r0.<init>()
            int r1 = r3.f11004Y
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
            int r1 = r3.f11005Z
            android.media.AudioAttributes$Builder r0 = r0.setFlags(r1)
            int r1 = r3.f11006a0
            android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
            int r1 = p371v5.C6552b0.f25624a
            r2 = 29
            if (r1 < r2) goto L26
            int r1 = r3.f11007b0
            r0.setAllowedCapturePolicy(r1)
        L26:
            android.media.AudioAttributes r0 = r0.build()
            r3.f11008c0 = r0
        L2c:
            android.media.AudioAttributes r0 = r3.f11008c0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2d
            java.lang.Class<h4.d> r2 = p121h4.C2461d.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2d
        L10:
            h4.d r5 = (p121h4.C2461d) r5
            int r2 = r4.f11004Y
            int r3 = r5.f11004Y
            if (r2 != r3) goto L2b
            int r2 = r4.f11005Z
            int r3 = r5.f11005Z
            if (r2 != r3) goto L2b
            int r2 = r4.f11006a0
            int r3 = r5.f11006a0
            if (r2 != r3) goto L2b
            int r2 = r4.f11007b0
            int r5 = r5.f11007b0
            if (r2 != r5) goto L2b
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
        L2d:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f11004Y
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f11005Z
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f11006a0
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f11007b0
            int r1 = r1 + r0
            return r1
    }
}
