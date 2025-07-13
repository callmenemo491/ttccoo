package p031c1;

/* renamed from: c1.q */
/* loaded from: classes.dex */
public final class C0849q {

    /* renamed from: a */
    public p031c1.C0851s f4605a;

    public C0849q(android.media.session.MediaSessionManager.RemoteUserInfo r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = "package shouldn't be null"
            java.util.Objects.requireNonNull(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            c1.r r0 = new c1.r
            r0.<init>(r3)
            r2.f4605a = r0
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "packageName should be nonempty"
            r3.<init>(r0)
            throw r3
    }

    public C0849q(java.lang.String r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "package shouldn't be null"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L22
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1a
            c1.r r0 = new c1.r
            r0.<init>(r3, r4, r5)
            goto L1f
        L1a:
            c1.s r0 = new c1.s
            r0.<init>(r3, r4, r5)
        L1f:
            r2.f4605a = r0
            return
        L22:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "packageName should be nonempty"
            r3.<init>(r4)
            throw r3
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p031c1.C0849q
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            c1.s r0 = r1.f4605a
            c1.q r2 = (p031c1.C0849q) r2
            c1.s r2 = r2.f4605a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            c1.s r0 = r1.f4605a
            int r0 = r0.hashCode()
            return r0
    }
}
