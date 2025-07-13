package com.google.android.gms.common;

/* renamed from: com.google.android.gms.common.a */
/* loaded from: classes.dex */
public enum EnumC1078a extends java.lang.Enum<com.google.android.gms.common.EnumC1078a> {

    /* renamed from: Z */
    public static final com.google.android.gms.common.EnumC1078a f5524Z = null;

    /* renamed from: a0 */
    public static final com.google.android.gms.common.EnumC1078a f5525a0 = null;

    /* renamed from: b0 */
    public static final /* synthetic */ com.google.android.gms.common.EnumC1078a[] f5526b0 = null;

    /* renamed from: Y */
    public final int f5527Y;

    static {
            com.google.android.gms.common.a r0 = new com.google.android.gms.common.a
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.common.EnumC1078a.f5524Z = r0
            com.google.android.gms.common.a r1 = new com.google.android.gms.common.a
            java.lang.String r3 = "UNKNOWN_CERT"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.common.a r3 = new com.google.android.gms.common.a
            java.lang.String r5 = "TEST_KEYS_REJECTED"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.common.a r5 = new com.google.android.gms.common.a
            java.lang.String r7 = "PACKAGE_NOT_FOUND"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.common.EnumC1078a.f5525a0 = r5
            com.google.android.gms.common.a r7 = new com.google.android.gms.common.a
            java.lang.String r9 = "GENERIC_ERROR"
            r10 = 4
            r7.<init>(r9, r10, r10)
            r9 = 5
            com.google.android.gms.common.a[] r9 = new com.google.android.gms.common.EnumC1078a[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            com.google.android.gms.common.EnumC1078a.f5526b0 = r9
            return
    }

    EnumC1078a(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f5527Y = r3
            return
    }

    /* renamed from: e */
    public static com.google.android.gms.common.EnumC1078a m3040e(int r5) {
            com.google.android.gms.common.a[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.f5527Y
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            com.google.android.gms.common.a r5 = com.google.android.gms.common.EnumC1078a.f5524Z
            return r5
    }

    public static com.google.android.gms.common.EnumC1078a[] values() {
            com.google.android.gms.common.a[] r0 = com.google.android.gms.common.EnumC1078a.f5526b0
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.common.a[] r0 = (com.google.android.gms.common.EnumC1078a[]) r0
            return r0
    }
}
