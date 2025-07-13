package p417xf;

/* renamed from: xf.t */
/* loaded from: classes.dex */
public final class C7066t {
    private final java.util.Map<java.lang.String, java.lang.Object> immutable_data;
    private final java.util.Map<java.lang.String, java.lang.Object> mutable_data;
    private final java.lang.String template_id;

    public C7066t(java.lang.String r2, java.util.Map<java.lang.String, ? extends java.lang.Object> r3, java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r3, r0)
            r1.<init>()
            r1.template_id = r2
            r1.immutable_data = r3
            r1.mutable_data = r4
            return
    }

    public static /* synthetic */ p417xf.C7066t copy$default(p417xf.C7066t r0, java.lang.String r1, java.util.Map r2, java.util.Map r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.template_id
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.immutable_data
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.mutable_data
        L12:
            xf.t r0 = r0.copy(r1, r2, r3)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component2() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.immutable_data
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component3() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mutable_data
            return r0
    }

    public final p417xf.C7066t copy(java.lang.String r2, java.util.Map<java.lang.String, ? extends java.lang.Object> r3, java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r3, r0)
            xf.t r0 = new xf.t
            r0.<init>(r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7066t
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.t r5 = (p417xf.C7066t) r5
            java.lang.String r1 = r4.template_id
            java.lang.String r3 = r5.template_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.immutable_data
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.immutable_data
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.mutable_data
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.mutable_data
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.lang.String getBackimg() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            java.lang.String r1 = "backimg"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.toString()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public final java.lang.String getGif() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            java.lang.String r1 = "gif"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.toString()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public final java.lang.String getImg() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            java.lang.String r1 = "img"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L22
        L10:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            if (r0 == 0) goto L21
            java.lang.String r1 = "original_image"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L21
            java.lang.String r0 = r0.toString()
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public final java.lang.String getImg_back() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            java.lang.String r1 = "img_back"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.toString()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getImmutable_data() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.immutable_data
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getMutable_data() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.mutable_data
            return r0
    }

    public final java.lang.String getName() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            java.lang.String r1 = "name"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L22
        L10:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            if (r0 == 0) goto L21
            java.lang.String r1 = "original_name"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L21
            java.lang.String r0 = r0.toString()
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public final java.lang.String getTemplate_id() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.lang.String getVideo() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            java.lang.String r1 = "video"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.toString()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.template_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.immutable_data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.mutable_data
            if (r0 != 0) goto L17
            r0 = 0
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            int r1 = r1 + r0
            return r1
    }

    public final p417xf.C7062p toNFTDetailUI() {
            r7 = this;
            xf.p r6 = new xf.p
            java.lang.String r1 = r7.template_id
            java.lang.String r2 = r7.getName()
            java.lang.String r3 = r7.getImg()
            java.lang.String r4 = r7.getVideo()
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.immutable_data
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "NFTTemplateDetail(template_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.template_id
            r0.append(r1)
            java.lang.String r1 = ", immutable_data="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.immutable_data
            r0.append(r1)
            java.lang.String r1 = ", mutable_data="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.mutable_data
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
