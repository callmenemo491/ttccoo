package p205ld;

/* renamed from: ld.f */
/* loaded from: classes.dex */
public final class C4269f {

    /* renamed from: a */
    public final java.lang.String f17468a;

    public C4269f(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "imageUrl"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f17468a = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p205ld.C4269f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ld.f r4 = (p205ld.C4269f) r4
            java.lang.String r1 = r3.f17468a
            java.lang.String r4 = r4.f17468a
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f17468a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "MyVideoModel(imageUrl="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f17468a
            r2 = 41
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
