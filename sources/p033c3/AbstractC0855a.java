package p033c3;

import p033c3.AbstractC0855a;

/* renamed from: c3.a */
/* loaded from: classes.dex */
public abstract class AbstractC0855a<T extends p033c3.AbstractC0855a<T>> implements java.lang.Cloneable {

    /* renamed from: Y */
    public int f4621Y;

    /* renamed from: Z */
    public float f4622Z;

    /* renamed from: a0 */
    public p214m2.AbstractC4333k f4623a0;

    /* renamed from: b0 */
    public com.bumptech.glide.EnumC1003g f4624b0;

    /* renamed from: c0 */
    public android.graphics.drawable.Drawable f4625c0;

    /* renamed from: d0 */
    public int f4626d0;

    /* renamed from: e0 */
    public android.graphics.drawable.Drawable f4627e0;

    /* renamed from: f0 */
    public int f4628f0;

    /* renamed from: g0 */
    public boolean f4629g0;

    /* renamed from: h0 */
    public int f4630h0;

    /* renamed from: i0 */
    public int f4631i0;

    /* renamed from: j0 */
    public p180k2.InterfaceC3671c f4632j0;

    /* renamed from: k0 */
    public boolean f4633k0;

    /* renamed from: l0 */
    public boolean f4634l0;

    /* renamed from: m0 */
    public android.graphics.drawable.Drawable f4635m0;

    /* renamed from: n0 */
    public int f4636n0;

    /* renamed from: o0 */
    public p180k2.C3673e f4637o0;

    /* renamed from: p0 */
    public java.util.Map<java.lang.Class<?>, p180k2.InterfaceC3676h<?>> f4638p0;

    /* renamed from: q0 */
    public java.lang.Class<?> f4639q0;

    /* renamed from: r0 */
    public boolean f4640r0;

    /* renamed from: s0 */
    public android.content.res.Resources.Theme f4641s0;

    /* renamed from: t0 */
    public boolean f4642t0;

    /* renamed from: u0 */
    public boolean f4643u0;

    /* renamed from: v0 */
    public boolean f4644v0;

    /* renamed from: w0 */
    public boolean f4645w0;

    /* renamed from: x0 */
    public boolean f4646x0;

    public AbstractC0855a() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.f4622Z = r0
            m2.k r0 = p214m2.AbstractC4333k.f17723d
            r2.f4623a0 = r0
            com.bumptech.glide.g r0 = com.bumptech.glide.EnumC1003g.f5137a0
            r2.f4624b0 = r0
            r0 = 1
            r2.f4629g0 = r0
            r1 = -1
            r2.f4630h0 = r1
            r2.f4631i0 = r1
            f3.a r1 = p087f3.C1988a.f8769b
            r2.f4632j0 = r1
            r2.f4634l0 = r0
            k2.e r1 = new k2.e
            r1.<init>()
            r2.f4637o0 = r1
            g3.b r1 = new g3.b
            r1.<init>()
            r2.f4638p0 = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2.f4639q0 = r1
            r2.f4645w0 = r0
            return
    }

    /* renamed from: m */
    public static boolean m2522m(int r0, int r1) {
            r0 = r0 & r1
            if (r0 == 0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    /* renamed from: A */
    public T mo2523A(p180k2.InterfaceC3671c r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2523A(r2)
            return r2
        Ld:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f4632j0 = r2
            int r2 = r1.f4621Y
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r1.f4621Y = r2
            r1.m2549y()
            return r1
    }

    /* renamed from: B */
    public T mo2524B(boolean r3) {
            r2 = this;
            boolean r0 = r2.f4642t0
            r1 = 1
            if (r0 == 0) goto Le
            c3.a r3 = r2.mo2532c()
            c3.a r3 = r3.mo2524B(r1)
            return r3
        Le:
            r3 = r3 ^ r1
            r2.f4629g0 = r3
            int r3 = r2.f4621Y
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.f4621Y = r3
            r2.m2549y()
            return r2
    }

    /* renamed from: C */
    public <Y> T m2525C(java.lang.Class<Y> r2, p180k2.InterfaceC3676h<Y> r3, boolean r4) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.m2525C(r2, r3, r4)
            return r2
        Ld:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.Objects.requireNonNull(r3, r0)
            java.util.Map<java.lang.Class<?>, k2.h<?>> r0 = r1.f4638p0
            r0.put(r2, r3)
            int r2 = r1.f4621Y
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.f4621Y = r2
            r3 = 1
            r1.f4634l0 = r3
            r0 = 65536(0x10000, float:9.1835E-41)
            r2 = r2 | r0
            r1.f4621Y = r2
            r0 = 0
            r1.f4645w0 = r0
            if (r4 == 0) goto L34
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f4621Y = r2
            r1.f4633k0 = r3
        L34:
            r1.m2549y()
            return r1
    }

    /* renamed from: D */
    public T mo2526D(p180k2.InterfaceC3676h<android.graphics.Bitmap> r2) {
            r1 = this;
            r0 = 1
            c3.a r2 = r1.m2527E(r2, r0)
            return r2
    }

    /* renamed from: E */
    public T m2527E(p180k2.InterfaceC3676h<android.graphics.Bitmap> r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r2.mo2532c()
            c3.a r3 = r0.m2527E(r3, r4)
            return r3
        Ld:
            t2.n r0 = new t2.n
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.m2525C(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.m2525C(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.m2525C(r1, r0, r4)
            java.lang.Class<x2.c> r0 = p404x2.C6914c.class
            x2.d r1 = new x2.d
            r1.<init>(r3)
            r2.m2525C(r0, r1, r4)
            r2.m2549y()
            return r2
    }

    /* renamed from: F */
    public final T m2528F(p334t2.AbstractC6133k r2, p180k2.InterfaceC3676h<android.graphics.Bitmap> r3) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.m2528F(r2, r3)
            return r2
        Ld:
            r1.mo2535f(r2)
            c3.a r2 = r1.mo2526D(r3)
            return r2
    }

    /* renamed from: G */
    public T mo2529G(boolean r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2529G(r2)
            return r2
        Ld:
            r1.f4646x0 = r2
            int r2 = r1.f4621Y
            r0 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r0
            r1.f4621Y = r2
            r1.m2549y()
            return r1
    }

    /* renamed from: a */
    public T mo2530a(p033c3.AbstractC0855a<?> r5) {
            r4 = this;
            boolean r0 = r4.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r4.mo2532c()
            c3.a r5 = r0.mo2530a(r5)
            return r5
        Ld:
            int r0 = r5.f4621Y
            r1 = 2
            boolean r0 = m2522m(r0, r1)
            if (r0 == 0) goto L1a
            float r0 = r5.f4622Z
            r4.f4622Z = r0
        L1a:
            int r0 = r5.f4621Y
            r1 = 262144(0x40000, float:3.67342E-40)
            boolean r0 = m2522m(r0, r1)
            if (r0 == 0) goto L28
            boolean r0 = r5.f4643u0
            r4.f4643u0 = r0
        L28:
            int r0 = r5.f4621Y
            r1 = 1048576(0x100000, float:1.469368E-39)
            boolean r0 = m2522m(r0, r1)
            if (r0 == 0) goto L36
            boolean r0 = r5.f4646x0
            r4.f4646x0 = r0
        L36:
            int r0 = r5.f4621Y
            r1 = 4
            boolean r0 = m2522m(r0, r1)
            if (r0 == 0) goto L43
            m2.k r0 = r5.f4623a0
            r4.f4623a0 = r0
        L43:
            int r0 = r5.f4621Y
            r1 = 8
            boolean r0 = m2522m(r0, r1)
            if (r0 == 0) goto L51
            com.bumptech.glide.g r0 = r5.f4624b0
            r4.f4624b0 = r0
        L51:
            int r0 = r5.f4621Y
            r1 = 16
            boolean r0 = m2522m(r0, r1)
            r1 = 0
            if (r0 == 0) goto L68
            android.graphics.drawable.Drawable r0 = r5.f4625c0
            r4.f4625c0 = r0
            r4.f4626d0 = r1
            int r0 = r4.f4621Y
            r0 = r0 & (-33)
            r4.f4621Y = r0
        L68:
            int r0 = r5.f4621Y
            r2 = 32
            boolean r0 = m2522m(r0, r2)
            r2 = 0
            if (r0 == 0) goto L7f
            int r0 = r5.f4626d0
            r4.f4626d0 = r0
            r4.f4625c0 = r2
            int r0 = r4.f4621Y
            r0 = r0 & (-17)
            r4.f4621Y = r0
        L7f:
            int r0 = r5.f4621Y
            r3 = 64
            boolean r0 = m2522m(r0, r3)
            if (r0 == 0) goto L95
            android.graphics.drawable.Drawable r0 = r5.f4627e0
            r4.f4627e0 = r0
            r4.f4628f0 = r1
            int r0 = r4.f4621Y
            r0 = r0 & (-129(0xffffffffffffff7f, float:NaN))
            r4.f4621Y = r0
        L95:
            int r0 = r5.f4621Y
            r3 = 128(0x80, float:1.8E-43)
            boolean r0 = m2522m(r0, r3)
            if (r0 == 0) goto Lab
            int r0 = r5.f4628f0
            r4.f4628f0 = r0
            r4.f4627e0 = r2
            int r0 = r4.f4621Y
            r0 = r0 & (-65)
            r4.f4621Y = r0
        Lab:
            int r0 = r5.f4621Y
            r3 = 256(0x100, float:3.59E-43)
            boolean r0 = m2522m(r0, r3)
            if (r0 == 0) goto Lb9
            boolean r0 = r5.f4629g0
            r4.f4629g0 = r0
        Lb9:
            int r0 = r5.f4621Y
            r3 = 512(0x200, float:7.17E-43)
            boolean r0 = m2522m(r0, r3)
            if (r0 == 0) goto Lcb
            int r0 = r5.f4631i0
            r4.f4631i0 = r0
            int r0 = r5.f4630h0
            r4.f4630h0 = r0
        Lcb:
            int r0 = r5.f4621Y
            r3 = 1024(0x400, float:1.435E-42)
            boolean r0 = m2522m(r0, r3)
            if (r0 == 0) goto Ld9
            k2.c r0 = r5.f4632j0
            r4.f4632j0 = r0
        Ld9:
            int r0 = r5.f4621Y
            r3 = 4096(0x1000, float:5.74E-42)
            boolean r0 = m2522m(r0, r3)
            if (r0 == 0) goto Le7
            java.lang.Class<?> r0 = r5.f4639q0
            r4.f4639q0 = r0
        Le7:
            int r0 = r5.f4621Y
            r3 = 8192(0x2000, float:1.148E-41)
            boolean r0 = m2522m(r0, r3)
            if (r0 == 0) goto Lfd
            android.graphics.drawable.Drawable r0 = r5.f4635m0
            r4.f4635m0 = r0
            r4.f4636n0 = r1
            int r0 = r4.f4621Y
            r0 = r0 & (-16385(0xffffffffffffbfff, float:NaN))
            r4.f4621Y = r0
        Lfd:
            int r0 = r5.f4621Y
            r3 = 16384(0x4000, float:2.2959E-41)
            boolean r0 = m2522m(r0, r3)
            if (r0 == 0) goto L113
            int r0 = r5.f4636n0
            r4.f4636n0 = r0
            r4.f4635m0 = r2
            int r0 = r4.f4621Y
            r0 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
            r4.f4621Y = r0
        L113:
            int r0 = r5.f4621Y
            r2 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = m2522m(r0, r2)
            if (r0 == 0) goto L122
            android.content.res.Resources$Theme r0 = r5.f4641s0
            r4.f4641s0 = r0
        L122:
            int r0 = r5.f4621Y
            r2 = 65536(0x10000, float:9.1835E-41)
            boolean r0 = m2522m(r0, r2)
            if (r0 == 0) goto L130
            boolean r0 = r5.f4634l0
            r4.f4634l0 = r0
        L130:
            int r0 = r5.f4621Y
            r2 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = m2522m(r0, r2)
            if (r0 == 0) goto L13e
            boolean r0 = r5.f4633k0
            r4.f4633k0 = r0
        L13e:
            int r0 = r5.f4621Y
            r2 = 2048(0x800, float:2.87E-42)
            boolean r0 = m2522m(r0, r2)
            if (r0 == 0) goto L153
            java.util.Map<java.lang.Class<?>, k2.h<?>> r0 = r4.f4638p0
            java.util.Map<java.lang.Class<?>, k2.h<?>> r2 = r5.f4638p0
            r0.putAll(r2)
            boolean r0 = r5.f4645w0
            r4.f4645w0 = r0
        L153:
            int r0 = r5.f4621Y
            r2 = 524288(0x80000, float:7.34684E-40)
            boolean r0 = m2522m(r0, r2)
            if (r0 == 0) goto L161
            boolean r0 = r5.f4644v0
            r4.f4644v0 = r0
        L161:
            boolean r0 = r4.f4634l0
            if (r0 != 0) goto L17b
            java.util.Map<java.lang.Class<?>, k2.h<?>> r0 = r4.f4638p0
            r0.clear()
            int r0 = r4.f4621Y
            r0 = r0 & (-2049(0xfffffffffffff7ff, float:NaN))
            r4.f4621Y = r0
            r4.f4633k0 = r1
            r1 = -131073(0xfffffffffffdffff, float:NaN)
            r0 = r0 & r1
            r4.f4621Y = r0
            r0 = 1
            r4.f4645w0 = r0
        L17b:
            int r0 = r4.f4621Y
            int r1 = r5.f4621Y
            r0 = r0 | r1
            r4.f4621Y = r0
            k2.e r0 = r4.f4637o0
            k2.e r5 = r5.f4637o0
            r0.m8131d(r5)
            r4.m2549y()
            return r4
    }

    /* renamed from: b */
    public T mo2531b() {
            r2 = this;
            boolean r0 = r2.f4640r0
            if (r0 == 0) goto L11
            boolean r0 = r2.f4642t0
            if (r0 == 0) goto L9
            goto L11
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot auto lock an already locked options object, try clone() first"
            r0.<init>(r1)
            throw r0
        L11:
            r0 = 1
            r2.f4642t0 = r0
            c3.a r0 = r2.mo2539o()
            return r0
    }

    /* renamed from: c */
    public T mo2532c() {
            r3 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L24
            c3.a r0 = (p033c3.AbstractC0855a) r0     // Catch: java.lang.CloneNotSupportedException -> L24
            k2.e r1 = new k2.e     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L24
            r0.f4637o0 = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            k2.e r2 = r3.f4637o0     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.m8131d(r2)     // Catch: java.lang.CloneNotSupportedException -> L24
            g3.b r1 = new g3.b     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L24
            r0.f4638p0 = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            java.util.Map<java.lang.Class<?>, k2.h<?>> r2 = r3.f4638p0     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.putAll(r2)     // Catch: java.lang.CloneNotSupportedException -> L24
            r1 = 0
            r0.f4640r0 = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            r0.f4642t0 = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            return r0
        L24:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            c3.a r0 = r1.mo2532c()
            return r0
    }

    /* renamed from: d */
    public T mo2533d(java.lang.Class<?> r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2533d(r2)
            return r2
        Ld:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f4639q0 = r2
            int r2 = r1.f4621Y
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r1.f4621Y = r2
            r1.m2549y()
            return r1
    }

    /* renamed from: e */
    public T mo2534e(p214m2.AbstractC4333k r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2534e(r2)
            return r2
        Ld:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f4623a0 = r2
            int r2 = r1.f4621Y
            r2 = r2 | 4
            r1.f4621Y = r2
            r1.m2549y()
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p033c3.AbstractC0855a
            r1 = 0
            if (r0 == 0) goto Lae
            c3.a r4 = (p033c3.AbstractC0855a) r4
            float r0 = r4.f4622Z
            float r2 = r3.f4622Z
            int r0 = java.lang.Float.compare(r0, r2)
            if (r0 != 0) goto Lae
            int r0 = r3.f4626d0
            int r2 = r4.f4626d0
            if (r0 != r2) goto Lae
            android.graphics.drawable.Drawable r0 = r3.f4625c0
            android.graphics.drawable.Drawable r2 = r4.f4625c0
            boolean r0 = p106g3.C2238j.m5842b(r0, r2)
            if (r0 == 0) goto Lae
            int r0 = r3.f4628f0
            int r2 = r4.f4628f0
            if (r0 != r2) goto Lae
            android.graphics.drawable.Drawable r0 = r3.f4627e0
            android.graphics.drawable.Drawable r2 = r4.f4627e0
            boolean r0 = p106g3.C2238j.m5842b(r0, r2)
            if (r0 == 0) goto Lae
            int r0 = r3.f4636n0
            int r2 = r4.f4636n0
            if (r0 != r2) goto Lae
            android.graphics.drawable.Drawable r0 = r3.f4635m0
            android.graphics.drawable.Drawable r2 = r4.f4635m0
            boolean r0 = p106g3.C2238j.m5842b(r0, r2)
            if (r0 == 0) goto Lae
            boolean r0 = r3.f4629g0
            boolean r2 = r4.f4629g0
            if (r0 != r2) goto Lae
            int r0 = r3.f4630h0
            int r2 = r4.f4630h0
            if (r0 != r2) goto Lae
            int r0 = r3.f4631i0
            int r2 = r4.f4631i0
            if (r0 != r2) goto Lae
            boolean r0 = r3.f4633k0
            boolean r2 = r4.f4633k0
            if (r0 != r2) goto Lae
            boolean r0 = r3.f4634l0
            boolean r2 = r4.f4634l0
            if (r0 != r2) goto Lae
            boolean r0 = r3.f4643u0
            boolean r2 = r4.f4643u0
            if (r0 != r2) goto Lae
            boolean r0 = r3.f4644v0
            boolean r2 = r4.f4644v0
            if (r0 != r2) goto Lae
            m2.k r0 = r3.f4623a0
            m2.k r2 = r4.f4623a0
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lae
            com.bumptech.glide.g r0 = r3.f4624b0
            com.bumptech.glide.g r2 = r4.f4624b0
            if (r0 != r2) goto Lae
            k2.e r0 = r3.f4637o0
            k2.e r2 = r4.f4637o0
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lae
            java.util.Map<java.lang.Class<?>, k2.h<?>> r0 = r3.f4638p0
            java.util.Map<java.lang.Class<?>, k2.h<?>> r2 = r4.f4638p0
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lae
            java.lang.Class<?> r0 = r3.f4639q0
            java.lang.Class<?> r2 = r4.f4639q0
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lae
            k2.c r0 = r3.f4632j0
            k2.c r2 = r4.f4632j0
            boolean r0 = p106g3.C2238j.m5842b(r0, r2)
            if (r0 == 0) goto Lae
            android.content.res.Resources$Theme r0 = r3.f4641s0
            android.content.res.Resources$Theme r4 = r4.f4641s0
            boolean r4 = p106g3.C2238j.m5842b(r0, r4)
            if (r4 == 0) goto Lae
            r1 = 1
        Lae:
            return r1
    }

    /* renamed from: f */
    public T mo2535f(p334t2.AbstractC6133k r3) {
            r2 = this;
            k2.d<t2.k> r0 = p334t2.AbstractC6133k.f23680f
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r3, r1)
            c3.a r3 = r2.mo2550z(r0, r3)
            return r3
    }

    /* renamed from: g */
    public T mo2536g(int r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2536g(r2)
            return r2
        Ld:
            r1.f4626d0 = r2
            int r2 = r1.f4621Y
            r2 = r2 | 32
            r1.f4621Y = r2
            r0 = 0
            r1.f4625c0 = r0
            r2 = r2 & (-17)
            r1.f4621Y = r2
            r1.m2549y()
            return r1
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.f4622Z
            char[] r1 = p106g3.C2238j.f10214a
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = r0 + 527
            int r1 = r2.f4626d0
            int r0 = r0 * 31
            int r0 = r0 + r1
            android.graphics.drawable.Drawable r1 = r2.f4625c0
            int r0 = p106g3.C2238j.m5847g(r1, r0)
            int r1 = r2.f4628f0
            int r0 = r0 * 31
            int r0 = r0 + r1
            android.graphics.drawable.Drawable r1 = r2.f4627e0
            int r0 = p106g3.C2238j.m5847g(r1, r0)
            int r1 = r2.f4636n0
            int r0 = r0 * 31
            int r0 = r0 + r1
            android.graphics.drawable.Drawable r1 = r2.f4635m0
            int r0 = p106g3.C2238j.m5847g(r1, r0)
            boolean r1 = r2.f4629g0
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r1 = r2.f4630h0
            int r0 = r0 * 31
            int r0 = r0 + r1
            int r1 = r2.f4631i0
            int r0 = r0 * 31
            int r0 = r0 + r1
            boolean r1 = r2.f4633k0
            int r0 = r0 * 31
            int r0 = r0 + r1
            boolean r1 = r2.f4634l0
            int r0 = r0 * 31
            int r0 = r0 + r1
            boolean r1 = r2.f4643u0
            int r0 = r0 * 31
            int r0 = r0 + r1
            boolean r1 = r2.f4644v0
            int r0 = r0 * 31
            int r0 = r0 + r1
            m2.k r1 = r2.f4623a0
            int r0 = p106g3.C2238j.m5847g(r1, r0)
            com.bumptech.glide.g r1 = r2.f4624b0
            int r0 = p106g3.C2238j.m5847g(r1, r0)
            k2.e r1 = r2.f4637o0
            int r0 = p106g3.C2238j.m5847g(r1, r0)
            java.util.Map<java.lang.Class<?>, k2.h<?>> r1 = r2.f4638p0
            int r0 = p106g3.C2238j.m5847g(r1, r0)
            java.lang.Class<?> r1 = r2.f4639q0
            int r0 = p106g3.C2238j.m5847g(r1, r0)
            k2.c r1 = r2.f4632j0
            int r0 = p106g3.C2238j.m5847g(r1, r0)
            android.content.res.Resources$Theme r1 = r2.f4641s0
            int r0 = p106g3.C2238j.m5847g(r1, r0)
            return r0
    }

    /* renamed from: j */
    public T mo2537j(int r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2537j(r2)
            return r2
        Ld:
            r1.f4636n0 = r2
            int r2 = r1.f4621Y
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            r1.f4621Y = r2
            r0 = 0
            r1.f4635m0 = r0
            r2 = r2 & (-8193(0xffffffffffffdfff, float:NaN))
            r1.f4621Y = r2
            r1.m2549y()
            return r1
    }

    /* renamed from: k */
    public T mo2538k() {
            r2 = this;
            t2.k r0 = p334t2.AbstractC6133k.f23675a
            t2.p r1 = new t2.p
            r1.<init>()
            c3.a r0 = r2.m2528F(r0, r1)
            r1 = 1
            r0.f4645w0 = r1
            return r0
    }

    /* renamed from: o */
    public T mo2539o() {
            r1 = this;
            r0 = 1
            r1.f4640r0 = r0
            return r1
    }

    /* renamed from: p */
    public T mo2540p(boolean r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2540p(r2)
            return r2
        Ld:
            r1.f4644v0 = r2
            int r2 = r1.f4621Y
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r0
            r1.f4621Y = r2
            r1.m2549y()
            return r1
    }

    /* renamed from: q */
    public T mo2541q() {
            r2 = this;
            t2.k r0 = p334t2.AbstractC6133k.f23677c
            t2.h r1 = new t2.h
            r1.<init>()
            c3.a r0 = r2.m2544t(r0, r1)
            return r0
    }

    /* renamed from: r */
    public T mo2542r() {
            r2 = this;
            t2.k r0 = p334t2.AbstractC6133k.f23676b
            t2.i r1 = new t2.i
            r1.<init>()
            c3.a r0 = r2.m2544t(r0, r1)
            r1 = 1
            r0.f4645w0 = r1
            return r0
    }

    /* renamed from: s */
    public T mo2543s() {
            r2 = this;
            t2.k r0 = p334t2.AbstractC6133k.f23675a
            t2.p r1 = new t2.p
            r1.<init>()
            c3.a r0 = r2.m2544t(r0, r1)
            r1 = 1
            r0.f4645w0 = r1
            return r0
    }

    /* renamed from: t */
    public final T m2544t(p334t2.AbstractC6133k r2, p180k2.InterfaceC3676h<android.graphics.Bitmap> r3) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.m2544t(r2, r3)
            return r2
        Ld:
            r1.mo2535f(r2)
            r2 = 0
            c3.a r2 = r1.m2527E(r3, r2)
            return r2
    }

    /* renamed from: u */
    public T mo2545u(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2545u(r2, r3)
            return r2
        Ld:
            r1.f4631i0 = r2
            r1.f4630h0 = r3
            int r2 = r1.f4621Y
            r2 = r2 | 512(0x200, float:7.17E-43)
            r1.f4621Y = r2
            r1.m2549y()
            return r1
    }

    /* renamed from: v */
    public T mo2546v(int r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2546v(r2)
            return r2
        Ld:
            r1.f4628f0 = r2
            int r2 = r1.f4621Y
            r2 = r2 | 128(0x80, float:1.8E-43)
            r1.f4621Y = r2
            r0 = 0
            r1.f4627e0 = r0
            r2 = r2 & (-65)
            r1.f4621Y = r2
            r1.m2549y()
            return r1
    }

    /* renamed from: w */
    public T mo2547w(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2547w(r2)
            return r2
        Ld:
            r1.f4627e0 = r2
            int r2 = r1.f4621Y
            r2 = r2 | 64
            r1.f4621Y = r2
            r0 = 0
            r1.f4628f0 = r0
            r2 = r2 & (-129(0xffffffffffffff7f, float:NaN))
            r1.f4621Y = r2
            r1.m2549y()
            return r1
    }

    /* renamed from: x */
    public T mo2548x(com.bumptech.glide.EnumC1003g r2) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2548x(r2)
            return r2
        Ld:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f4624b0 = r2
            int r2 = r1.f4621Y
            r2 = r2 | 8
            r1.f4621Y = r2
            r1.m2549y()
            return r1
    }

    /* renamed from: y */
    public final T m2549y() {
            r2 = this;
            boolean r0 = r2.f4640r0
            if (r0 != 0) goto L5
            return r2
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot modify locked T, consider clone()"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: z */
    public <Y> T mo2550z(p180k2.C3672d<Y> r2, Y r3) {
            r1 = this;
            boolean r0 = r1.f4642t0
            if (r0 == 0) goto Ld
            c3.a r0 = r1.mo2532c()
            c3.a r2 = r0.mo2550z(r2, r3)
            return r2
        Ld:
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.Objects.requireNonNull(r3, r0)
            k2.e r0 = r1.f4637o0
            s.a<k2.d<?>, java.lang.Object> r0 = r0.f16250b
            r0.put(r2, r3)
            r1.m2549y()
            return r1
    }
}
