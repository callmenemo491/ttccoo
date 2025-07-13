package p182k4;

/* renamed from: k4.e */
/* loaded from: classes.dex */
public final class C3690e {

    /* renamed from: a */
    public final android.util.SparseArray<p182k4.C3689d.a> f16333a;

    public C3690e() {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.f16333a = r0
            return
    }

    /* renamed from: a */
    public final void m8143a(int r12, com.google.android.gms.cast.MediaInfo r13, long r14) {
            r11 = this;
            android.util.SparseArray<k4.d$a> r0 = r11.f16333a
            k4.d$a r1 = p182k4.C3689d.a.f16329d
            java.lang.Object r0 = r0.get(r12, r1)
            k4.d$a r0 = (p182k4.C3689d.a) r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r13 != 0) goto L12
            goto L25
        L12:
            long r3 = r13.f5377c0
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L25
            r5 = -1000(0xfffffffffffffc18, double:NaN)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L25
            long r3 = p371v5.C6552b0.m13297A(r3)
            goto L26
        L25:
            r3 = r1
        L26:
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L2c
            long r3 = r0.f16330a
        L2c:
            r6 = r3
            if (r13 != 0) goto L33
            boolean r13 = r0.f16332c
            r10 = r13
            goto L3d
        L33:
            int r13 = r13.f5374Z
            r3 = 2
            if (r13 != r3) goto L3b
            r13 = 1
            r10 = 1
            goto L3d
        L3b:
            r13 = 0
            r10 = 0
        L3d:
            int r13 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r13 != 0) goto L43
            long r14 = r0.f16331b
        L43:
            r8 = r14
            android.util.SparseArray<k4.d$a> r13 = r11.f16333a
            long r14 = r0.f16330a
            int r1 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r1 != 0) goto L57
            long r14 = r0.f16331b
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 != 0) goto L57
            boolean r14 = r0.f16332c
            if (r10 != r14) goto L57
            goto L5d
        L57:
            k4.d$a r0 = new k4.d$a
            r5 = r0
            r5.<init>(r6, r8, r10)
        L5d:
            r13.put(r12, r0)
            return
    }
}
