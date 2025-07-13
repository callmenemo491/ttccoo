package p071e6;

/* renamed from: e6.e */
/* loaded from: classes.dex */
public class C1529e extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p071e6.C1529e> CREATOR = null;

    /* renamed from: E0 */
    public static final java.util.List<java.lang.String> f7408E0 = null;

    /* renamed from: F0 */
    public static final int[] f7409F0 = null;

    /* renamed from: A0 */
    public final int f7410A0;

    /* renamed from: B0 */
    public final int f7411B0;

    /* renamed from: C0 */
    public final int f7412C0;

    /* renamed from: D0 */
    public final p071e6.InterfaceC1547v f7413D0;

    /* renamed from: Y */
    public final java.util.List<java.lang.String> f7414Y;

    /* renamed from: Z */
    public final int[] f7415Z;

    /* renamed from: a0 */
    public final long f7416a0;

    /* renamed from: b0 */
    public final java.lang.String f7417b0;

    /* renamed from: c0 */
    public final int f7418c0;

    /* renamed from: d0 */
    public final int f7419d0;

    /* renamed from: e0 */
    public final int f7420e0;

    /* renamed from: f0 */
    public final int f7421f0;

    /* renamed from: g0 */
    public final int f7422g0;

    /* renamed from: h0 */
    public final int f7423h0;

    /* renamed from: i0 */
    public final int f7424i0;

    /* renamed from: j0 */
    public final int f7425j0;

    /* renamed from: k0 */
    public final int f7426k0;

    /* renamed from: l0 */
    public final int f7427l0;

    /* renamed from: m0 */
    public final int f7428m0;

    /* renamed from: n0 */
    public final int f7429n0;

    /* renamed from: o0 */
    public final int f7430o0;

    /* renamed from: p0 */
    public final int f7431p0;

    /* renamed from: q0 */
    public final int f7432q0;

    /* renamed from: r0 */
    public final int f7433r0;

    /* renamed from: s0 */
    public final int f7434s0;

    /* renamed from: t0 */
    public final int f7435t0;

    /* renamed from: u0 */
    public final int f7436u0;

    /* renamed from: v0 */
    public final int f7437v0;

    /* renamed from: w0 */
    public final int f7438w0;

    /* renamed from: x0 */
    public final int f7439x0;

    /* renamed from: y0 */
    public final int f7440y0;

    /* renamed from: z0 */
    public final int f7441z0;

    /* renamed from: e6.e$a */
    public static final class a {
        /* renamed from: a */
        public static int m4107a(java.lang.String r5) {
                r0 = 0
                java.lang.Class<com.google.android.gms.cast.framework.media.internal.ResourceProvider> r1 = com.google.android.gms.cast.framework.media.internal.ResourceProvider.class
                java.util.Map<java.lang.String, java.lang.Integer> r2 = com.google.android.gms.cast.framework.media.internal.ResourceProvider.f5506a     // Catch: java.lang.Throwable -> L24
                r2 = 1
                java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L24
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r3[r0] = r4     // Catch: java.lang.Throwable -> L24
                java.lang.String r4 = "findResourceByName"
                java.lang.reflect.Method r1 = r1.getMethod(r4, r3)     // Catch: java.lang.Throwable -> L24
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L24
                r2[r0] = r5     // Catch: java.lang.Throwable -> L24
                r5 = 0
                java.lang.Object r5 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L24
                java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L24
                if (r5 != 0) goto L20
                goto L24
            L20:
                int r0 = r5.intValue()     // Catch: java.lang.Throwable -> L24
            L24:
                return r0
        }
    }

    static {
            java.lang.String r0 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            java.lang.String r1 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            p071e6.C1529e.f7408E0 = r0
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x001e: FILL_ARRAY_DATA , data: [0, 1} // fill-array
            p071e6.C1529e.f7409F0 = r0
            e6.g r0 = new e6.g
            r0.<init>()
            p071e6.C1529e.CREATOR = r0
            return
    }

    public C1529e(@androidx.annotation.RecentlyNonNull java.util.List<java.lang.String> r6, @androidx.annotation.RecentlyNonNull int[] r7, long r8, @androidx.annotation.RecentlyNonNull java.lang.String r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, android.os.IBinder r38) {
            r5 = this;
            r0 = r5
            r1 = r7
            r2 = r38
            r5.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = r6
            r3.<init>(r6)
            r0.f7414Y = r3
            int r3 = r1.length
            int[] r1 = java.util.Arrays.copyOf(r7, r3)
            r0.f7415Z = r1
            r3 = r8
            r0.f7416a0 = r3
            r1 = r10
            r0.f7417b0 = r1
            r1 = r11
            r0.f7418c0 = r1
            r1 = r12
            r0.f7419d0 = r1
            r1 = r13
            r0.f7420e0 = r1
            r1 = r14
            r0.f7421f0 = r1
            r1 = r15
            r0.f7422g0 = r1
            r1 = r16
            r0.f7423h0 = r1
            r1 = r17
            r0.f7424i0 = r1
            r1 = r18
            r0.f7425j0 = r1
            r1 = r19
            r0.f7426k0 = r1
            r1 = r20
            r0.f7427l0 = r1
            r1 = r21
            r0.f7428m0 = r1
            r1 = r22
            r0.f7429n0 = r1
            r1 = r23
            r0.f7430o0 = r1
            r1 = r24
            r0.f7431p0 = r1
            r1 = r25
            r0.f7432q0 = r1
            r1 = r26
            r0.f7433r0 = r1
            r1 = r27
            r0.f7434s0 = r1
            r1 = r28
            r0.f7435t0 = r1
            r1 = r29
            r0.f7436u0 = r1
            r1 = r30
            r0.f7437v0 = r1
            r1 = r31
            r0.f7438w0 = r1
            r1 = r32
            r0.f7439x0 = r1
            r1 = r33
            r0.f7440y0 = r1
            r1 = r34
            r0.f7441z0 = r1
            r1 = r35
            r0.f7410A0 = r1
            r1 = r36
            r0.f7411B0 = r1
            r1 = r37
            r0.f7412C0 = r1
            if (r2 != 0) goto L89
            r1 = 0
            r0.f7413D0 = r1
            return
        L89:
            java.lang.String r1 = "com.google.android.gms.cast.framework.media.INotificationActionsProvider"
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof p071e6.InterfaceC1547v
            if (r3 == 0) goto L96
            e6.v r1 = (p071e6.InterfaceC1547v) r1
            goto L9b
        L96:
            e6.u r1 = new e6.u
            r1.<init>(r2)
        L9b:
            r0.f7413D0 = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            r7 = 20293(0x4f45, float:2.8437E-41)
            int r7 = p270p6.C5369c.m11723k(r6, r7)
            java.util.List<java.lang.String> r0 = r5.f7414Y
            r1 = 2
            r2 = 0
            p270p6.C5369c.m11720h(r6, r1, r0, r2)
            int[] r0 = r5.f7415Z
            int r1 = r0.length
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            if (r0 != 0) goto L17
            goto L22
        L17:
            r1 = 3
            int r1 = p270p6.C5369c.m11723k(r6, r1)
            r6.writeIntArray(r0)
            p270p6.C5369c.m11726n(r6, r1)
        L22:
            long r0 = r5.f7416a0
            r3 = 4
            r4 = 8
            p270p6.C5369c.m11724l(r6, r3, r4)
            r6.writeLong(r0)
            r0 = 5
            java.lang.String r1 = r5.f7417b0
            p270p6.C5369c.m11719g(r6, r0, r1, r2)
            r0 = 6
            int r1 = r5.f7418c0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 7
            int r1 = r5.f7419d0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            int r0 = r5.f7420e0
            p270p6.C5369c.m11724l(r6, r4, r3)
            r6.writeInt(r0)
            r0 = 9
            int r1 = r5.f7421f0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 10
            int r1 = r5.f7422g0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 11
            int r1 = r5.f7423h0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 12
            int r1 = r5.f7424i0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 13
            int r1 = r5.f7425j0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 14
            int r1 = r5.f7426k0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 15
            int r1 = r5.f7427l0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 16
            int r1 = r5.f7428m0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 17
            int r1 = r5.f7429n0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 18
            int r1 = r5.f7430o0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 19
            int r1 = r5.f7431p0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 20
            int r1 = r5.f7432q0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 21
            int r1 = r5.f7433r0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 22
            int r1 = r5.f7434s0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 23
            int r1 = r5.f7435t0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 24
            int r1 = r5.f7436u0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 25
            int r1 = r5.f7437v0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 26
            int r1 = r5.f7438w0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 27
            int r1 = r5.f7439x0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 28
            int r1 = r5.f7440y0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 29
            int r1 = r5.f7441z0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 30
            int r1 = r5.f7410A0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 31
            int r1 = r5.f7411B0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            r0 = 32
            int r1 = r5.f7412C0
            p270p6.C5369c.m11724l(r6, r0, r3)
            r6.writeInt(r1)
            e6.v r0 = r5.f7413D0
            if (r0 != 0) goto L143
            r0 = 0
            goto L147
        L143:
            android.os.IBinder r0 = r0.asBinder()
        L147:
            r1 = 33
            p270p6.C5369c.m11715c(r6, r1, r0, r2)
            p270p6.C5369c.m11726n(r6, r7)
            return
    }
}
