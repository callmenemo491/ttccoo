package p045d;

/* renamed from: d.b */
/* loaded from: classes.dex */
public final class C1256b extends p045d.AbstractC1255a<java.lang.String[], java.util.Map<java.lang.String, java.lang.Boolean>> {
    public C1256b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p045d.AbstractC1255a
    /* renamed from: a */
    public android.content.Intent mo1198a(android.content.Context r2, java.lang.String[] r3) {
            r1 = this;
            java.lang.String[] r3 = (java.lang.String[]) r3
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r0 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
            r2.<init>(r0)
            java.lang.String r0 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r2 = r2.putExtra(r0, r3)
            return r2
    }

    @Override // p045d.AbstractC1255a
    /* renamed from: b */
    public p045d.AbstractC1255a.a<java.util.Map<java.lang.String, java.lang.Boolean>> mo3704b(android.content.Context r10, java.lang.String[] r11) {
            r9 = this;
            java.lang.String[] r11 = (java.lang.String[]) r11
            if (r11 == 0) goto L36
            int r0 = r11.length
            if (r0 != 0) goto L8
            goto L36
        L8:
            s.a r0 = new s.a
            r0.<init>()
            int r1 = r11.length
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
        L12:
            if (r4 >= r1) goto L2c
            r6 = r11[r4]
            int r7 = p046d0.C1259a.m3705a(r10, r6)
            if (r7 != 0) goto L1e
            r7 = 1
            goto L1f
        L1e:
            r7 = 0
        L1f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r0.put(r6, r8)
            if (r7 != 0) goto L29
            r5 = 0
        L29:
            int r4 = r4 + 1
            goto L12
        L2c:
            if (r5 == 0) goto L34
            d.a$a r10 = new d.a$a
            r10.<init>(r0)
            goto L3f
        L34:
            r10 = 0
            goto L3f
        L36:
            d.a$a r10 = new d.a$a
            java.util.Map r11 = java.util.Collections.emptyMap()
            r10.<init>(r11)
        L3f:
            return r10
    }

    @Override // p045d.AbstractC1255a
    /* renamed from: c */
    public java.util.Map<java.lang.String, java.lang.Boolean> mo1199c(int r7, android.content.Intent r8) {
            r6 = this;
            r0 = -1
            if (r7 == r0) goto L8
        L3:
            java.util.Map r7 = java.util.Collections.emptyMap()
            goto L3a
        L8:
            if (r8 != 0) goto Lb
            goto L3
        Lb:
            java.lang.String r7 = "androidx.activity.result.contract.extra.PERMISSIONS"
            java.lang.String[] r7 = r8.getStringArrayExtra(r7)
            java.lang.String r0 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            int[] r8 = r8.getIntArrayExtra(r0)
            if (r8 == 0) goto L3
            if (r7 != 0) goto L1c
            goto L3
        L1c:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r7.length
            r2 = 0
            r3 = 0
        L24:
            if (r3 >= r1) goto L39
            r4 = r7[r3]
            r5 = r8[r3]
            if (r5 != 0) goto L2e
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.put(r4, r5)
            int r3 = r3 + 1
            goto L24
        L39:
            r7 = r0
        L3a:
            return r7
    }
}
