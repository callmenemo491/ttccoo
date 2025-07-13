package ch;

/* renamed from: ch.f */
/* loaded from: classes.dex */
public final class C0979f<T> implements java.io.Serializable {

    /* renamed from: Y */
    public final java.lang.Object f5052Y;

    /* renamed from: ch.f$a */
    public static final class a implements java.io.Serializable {

        /* renamed from: Y */
        public final java.lang.Throwable f5053Y;

        public a(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.f5053Y = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof ch.C0979f.a
                if (r0 == 0) goto L12
                java.lang.Throwable r0 = r1.f5053Y
                ch.f$a r2 = (ch.C0979f.a) r2
                java.lang.Throwable r2 = r2.f5053Y
                boolean r2 = p214m2.C4339q.m9702c(r0, r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Throwable r0 = r1.f5053Y
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Failure("
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.Throwable r1 = r2.f5053Y
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public /* synthetic */ C0979f(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f5052Y = r1
            return
    }

    /* renamed from: a */
    public static final /* synthetic */ ch.C0979f m2689a(java.lang.Object r1) {
            ch.f r0 = new ch.f
            r0.<init>(r1)
            return r0
    }

    /* renamed from: b */
    public static final java.lang.Throwable m2690b(java.lang.Object r1) {
            boolean r0 = r1 instanceof ch.C0979f.a
            if (r0 == 0) goto L9
            ch.f$a r1 = (ch.C0979f.a) r1
            java.lang.Throwable r1 = r1.f5053Y
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    /* renamed from: c */
    public static final boolean m2691c(java.lang.Object r0) {
            boolean r0 = r0 instanceof ch.C0979f.a
            r0 = r0 ^ 1
            return r0
    }

    /* renamed from: d */
    public final /* synthetic */ java.lang.Object m2692d() {
            r1 = this;
            java.lang.Object r0 = r1.f5052Y
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = r3.f5052Y
            boolean r1 = r4 instanceof ch.C0979f
            r2 = 0
            if (r1 != 0) goto L8
            goto L14
        L8:
            ch.f r4 = (ch.C0979f) r4
            java.lang.Object r4 = r4.f5052Y
            boolean r4 = p214m2.C4339q.m9702c(r0, r4)
            if (r4 != 0) goto L13
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f5052Y
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.f5052Y
            boolean r1 = r0 instanceof ch.C0979f.a
            if (r1 == 0) goto Ld
            ch.f$a r0 = (ch.C0979f.a) r0
            java.lang.String r0 = r0.toString()
            goto L23
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Success("
            r1.append(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L23:
            return r0
    }
}
