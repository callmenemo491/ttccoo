package p248o6;

/* renamed from: o6.z */
/* loaded from: classes.dex */
public final class C4946z {

    /* renamed from: a */
    public final android.util.SparseIntArray f19555a;

    /* renamed from: b */
    public p184k6.C3703f f19556b;

    public C4946z(p184k6.C3703f r2) {
            r1 = this;
            r1.<init>()
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.f19555a = r0
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f19556b = r2
            return
    }

    /* renamed from: a */
    public final int m11085a(android.content.Context r7, p201l6.C4181a.e r8) {
            r6 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.Objects.requireNonNull(r8, r0)
            boolean r0 = r8.mo6802f()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            int r8 = r8.mo2636h()
            android.util.SparseIntArray r0 = r6.f19555a
            r2 = -1
            int r0 = r0.get(r8, r2)
            if (r0 == r2) goto L1e
            return r0
        L1e:
            r3 = 0
        L1f:
            android.util.SparseIntArray r4 = r6.f19555a
            int r4 = r4.size()
            if (r3 >= r4) goto L3b
            android.util.SparseIntArray r4 = r6.f19555a
            int r4 = r4.keyAt(r3)
            if (r4 <= r8) goto L38
            android.util.SparseIntArray r5 = r6.f19555a
            int r4 = r5.get(r4)
            if (r4 != 0) goto L38
            goto L3c
        L38:
            int r3 = r3 + 1
            goto L1f
        L3b:
            r1 = r0
        L3c:
            if (r1 != r2) goto L44
            k6.f r0 = r6.f19556b
            int r1 = r0.mo8164b(r7, r8)
        L44:
            android.util.SparseIntArray r7 = r6.f19555a
            r7.put(r8, r1)
            return r1
    }
}
