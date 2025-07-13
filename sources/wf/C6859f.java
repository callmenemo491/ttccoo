package wf;

/* renamed from: wf.f */
/* loaded from: classes.dex */
public final class C6859f {

    /* renamed from: a */
    public final java.lang.String f26614a;

    /* renamed from: b */
    public final int f26615b;

    /* renamed from: c */
    public final java.lang.String f26616c;

    /* renamed from: d */
    public final java.lang.Integer f26617d;

    /* renamed from: e */
    public final boolean f26618e;

    public C6859f(java.lang.String r2, int r3, java.lang.String r4, java.lang.Integer r5) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f26614a = r2
            r1.f26615b = r3
            r1.f26616c = r4
            r1.f26617d = r5
            if (r5 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.f26618e = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wf.C6859f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wf.f r5 = (wf.C6859f) r5
            java.lang.String r1 = r4.f26614a
            java.lang.String r3 = r5.f26614a
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f26615b
            int r3 = r5.f26615b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.f26616c
            java.lang.String r3 = r5.f26616c
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.Integer r1 = r4.f26617d
            java.lang.Integer r5 = r5.f26617d
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L34
            return r2
        L34:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f26614a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r3.f26615b
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.f26616c
            r2 = 0
            if (r1 != 0) goto L14
            r1 = 0
            goto L18
        L14:
            int r1 = r1.hashCode()
        L18:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Integer r1 = r3.f26617d
            if (r1 != 0) goto L20
            goto L24
        L20:
            int r2 = r1.hashCode()
        L24:
            int r0 = r0 + r2
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Collection(name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f26614a
            r0.append(r1)
            java.lang.String r1 = ", asset="
            r0.append(r1)
            int r1 = r2.f26615b
            r0.append(r1)
            java.lang.String r1 = ", imageUrl="
            r0.append(r1)
            java.lang.String r1 = r2.f26616c
            r0.append(r1)
            java.lang.String r1 = ", imageRes="
            r0.append(r1)
            java.lang.Integer r1 = r2.f26617d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
