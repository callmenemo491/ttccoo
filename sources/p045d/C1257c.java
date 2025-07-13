package p045d;

/* renamed from: d.c */
/* loaded from: classes.dex */
public final class C1257c extends p045d.AbstractC1255a<java.lang.String, java.lang.Boolean> {
    public C1257c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p045d.AbstractC1255a
    /* renamed from: a */
    public android.content.Intent mo1198a(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r0 = 0
            r2[r0] = r3
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
            r3.<init>(r0)
            java.lang.String r0 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r2 = r3.putExtra(r0, r2)
            return r2
    }

    @Override // p045d.AbstractC1255a
    /* renamed from: b */
    public p045d.AbstractC1255a.a<java.lang.Boolean> mo3704b(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Lc
            d.a$a r1 = new d.a$a
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2)
            goto L1b
        Lc:
            int r1 = p046d0.C1259a.m3705a(r1, r2)
            if (r1 != 0) goto L1a
            d.a$a r1 = new d.a$a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.<init>(r2)
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    @Override // p045d.AbstractC1255a
    /* renamed from: c */
    public java.lang.Boolean mo1199c(int r2, android.content.Intent r3) {
            r1 = this;
            if (r3 == 0) goto L1d
            r0 = -1
            if (r2 == r0) goto L6
            goto L1d
        L6:
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            int[] r2 = r3.getIntArrayExtra(r2)
            if (r2 == 0) goto L1d
            int r3 = r2.length
            if (r3 != 0) goto L12
            goto L1d
        L12:
            r3 = 0
            r2 = r2[r3]
            if (r2 != 0) goto L18
            r3 = 1
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            goto L1f
        L1d:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L1f:
            return r2
    }
}
