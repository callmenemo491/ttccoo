package p251o9;

/* renamed from: o9.h */
/* loaded from: classes.dex */
public final class C5184h {

    /* renamed from: a */
    public final java.lang.String f20324a;

    /* renamed from: b */
    public final java.lang.String f20325b;

    /* renamed from: c */
    public final java.lang.String f20326c;

    /* renamed from: d */
    public final java.lang.String f20327d;

    /* renamed from: e */
    public final java.lang.String f20328e;

    /* renamed from: f */
    public final java.lang.String f20329f;

    /* renamed from: g */
    public final java.lang.String f20330g;

    public C5184h(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r2 = this;
            r2.<init>()
            boolean r0 = p353u6.C6347j.m12999b(r3)
            r0 = r0 ^ 1
            java.lang.String r1 = "ApplicationId must be set."
            com.google.android.gms.common.internal.C1101a.m3106k(r0, r1)
            r2.f20325b = r3
            r2.f20324a = r4
            r2.f20326c = r5
            r2.f20327d = r6
            r2.f20328e = r7
            r2.f20329f = r8
            r2.f20330g = r9
            return
    }

    /* renamed from: a */
    public static p251o9.C5184h m11503a(android.content.Context r12) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r12, r0)
            android.content.res.Resources r12 = r12.getResources()
            r0 = 2131951731(0x7f130073, float:1.9539885E38)
            java.lang.String r0 = r12.getResourcePackageName(r0)
            java.lang.String r1 = "google_app_id"
            java.lang.String r2 = "string"
            int r1 = r12.getIdentifier(r1, r2, r0)
            r3 = 0
            if (r1 != 0) goto L1d
            r5 = r3
            goto L22
        L1d:
            java.lang.String r1 = r12.getString(r1)
            r5 = r1
        L22:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L29
            return r3
        L29:
            o9.h r1 = new o9.h
            java.lang.String r4 = "google_api_key"
            int r4 = r12.getIdentifier(r4, r2, r0)
            if (r4 != 0) goto L35
            r6 = r3
            goto L3a
        L35:
            java.lang.String r4 = r12.getString(r4)
            r6 = r4
        L3a:
            java.lang.String r4 = "firebase_database_url"
            int r4 = r12.getIdentifier(r4, r2, r0)
            if (r4 != 0) goto L44
            r7 = r3
            goto L49
        L44:
            java.lang.String r4 = r12.getString(r4)
            r7 = r4
        L49:
            java.lang.String r4 = "ga_trackingId"
            int r4 = r12.getIdentifier(r4, r2, r0)
            if (r4 != 0) goto L53
            r8 = r3
            goto L58
        L53:
            java.lang.String r4 = r12.getString(r4)
            r8 = r4
        L58:
            java.lang.String r4 = "gcm_defaultSenderId"
            int r4 = r12.getIdentifier(r4, r2, r0)
            if (r4 != 0) goto L62
            r9 = r3
            goto L67
        L62:
            java.lang.String r4 = r12.getString(r4)
            r9 = r4
        L67:
            java.lang.String r4 = "google_storage_bucket"
            int r4 = r12.getIdentifier(r4, r2, r0)
            if (r4 != 0) goto L71
            r10 = r3
            goto L76
        L71:
            java.lang.String r4 = r12.getString(r4)
            r10 = r4
        L76:
            java.lang.String r4 = "project_id"
            int r0 = r12.getIdentifier(r4, r2, r0)
            if (r0 != 0) goto L7f
            goto L83
        L7f:
            java.lang.String r3 = r12.getString(r0)
        L83:
            r11 = r3
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p251o9.C5184h
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            o9.h r4 = (p251o9.C5184h) r4
            java.lang.String r0 = r3.f20325b
            java.lang.String r2 = r4.f20325b
            boolean r0 = p248o6.C4924o.m11074a(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.f20324a
            java.lang.String r2 = r4.f20324a
            boolean r0 = p248o6.C4924o.m11074a(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.f20326c
            java.lang.String r2 = r4.f20326c
            boolean r0 = p248o6.C4924o.m11074a(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.f20327d
            java.lang.String r2 = r4.f20327d
            boolean r0 = p248o6.C4924o.m11074a(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.f20328e
            java.lang.String r2 = r4.f20328e
            boolean r0 = p248o6.C4924o.m11074a(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.f20329f
            java.lang.String r2 = r4.f20329f
            boolean r0 = p248o6.C4924o.m11074a(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r3.f20330g
            java.lang.String r4 = r4.f20330g
            boolean r4 = p248o6.C4924o.m11074a(r0, r4)
            if (r4 == 0) goto L4f
            r1 = 1
        L4f:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f20325b
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f20324a
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.f20326c
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = r3.f20327d
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = r3.f20328e
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r3.f20329f
            r2 = 5
            r0[r2] = r1
            java.lang.String r1 = r3.f20330g
            r2 = 6
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            o6.o$a r0 = new o6.o$a
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.String r1 = r3.f20325b
            java.lang.String r2 = "applicationId"
            r0.m11075a(r2, r1)
            java.lang.String r1 = r3.f20324a
            java.lang.String r2 = "apiKey"
            r0.m11075a(r2, r1)
            java.lang.String r1 = r3.f20326c
            java.lang.String r2 = "databaseUrl"
            r0.m11075a(r2, r1)
            java.lang.String r1 = r3.f20328e
            java.lang.String r2 = "gcmSenderId"
            r0.m11075a(r2, r1)
            java.lang.String r1 = r3.f20329f
            java.lang.String r2 = "storageBucket"
            r0.m11075a(r2, r1)
            java.lang.String r1 = r3.f20330g
            java.lang.String r2 = "projectId"
            r0.m11075a(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
