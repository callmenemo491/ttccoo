package p417xf;

/* renamed from: xf.p */
/* loaded from: classes.dex */
public final class C7062p implements java.io.Serializable {
    private final java.lang.String img;
    private final java.util.Map<java.lang.String, java.lang.Object> immutable_data;
    private final java.lang.String name;
    private final java.lang.String template_id;
    private final java.lang.String video;

    public C7062p(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.Map<java.lang.String, ? extends java.lang.Object> r6) {
            r1 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r6, r0)
            r1.<init>()
            r1.template_id = r2
            r1.name = r3
            r1.img = r4
            r1.video = r5
            r1.immutable_data = r6
            return
    }

    public static /* synthetic */ p417xf.C7062p copy$default(p417xf.C7062p r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r4 = r3.template_id
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r5 = r3.name
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            java.lang.String r6 = r3.img
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.String r7 = r3.video
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            java.util.Map<java.lang.String, java.lang.Object> r8 = r3.immutable_data
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            xf.p r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.img
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.video
            return r0
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component5() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.immutable_data
            return r0
    }

    public final p417xf.C7062p copy(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.util.Map<java.lang.String, ? extends java.lang.Object> r12) {
            r7 = this;
            java.lang.String r0 = "template_id"
            p214m2.C4339q.m9706k(r8, r0)
            java.lang.String r0 = "immutable_data"
            p214m2.C4339q.m9706k(r12, r0)
            xf.p r0 = new xf.p
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p417xf.C7062p
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xf.p r5 = (p417xf.C7062p) r5
            java.lang.String r1 = r4.template_id
            java.lang.String r3 = r5.template_id
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.img
            java.lang.String r3 = r5.img
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.video
            java.lang.String r3 = r5.video
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.immutable_data
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.immutable_data
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final java.lang.String getBack_img() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            java.lang.String r1 = "back_img"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.toString()
            goto L10
        Lf:
            r0 = 0
        L10:
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

    public final java.lang.String getImageURL() {
            r4 = this;
            java.lang.String r0 = r4.img
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r1 = 2
            java.lang.String r2 = "http"
            r3 = 0
            boolean r0 = p362uh.C6463i.m13061R(r0, r2, r3, r1)
            if (r0 == 0) goto L13
            java.lang.String r0 = r4.img
            return r0
        L13:
            java.lang.String r0 = r4.img
            if (r0 == 0) goto L1d
            boolean r0 = p362uh.C6463i.m13054K(r0)
            if (r0 == 0) goto L1e
        L1d:
            r3 = 1
        L1e:
            if (r3 == 0) goto L23
            java.lang.String r0 = ""
            goto L32
        L23:
            java.lang.String r0 = "https://cdn.tacocrypto.io/default/resize:fit:400:400:0/plain/"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r4.img
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L32:
            return r0
    }

    public final java.lang.String getImg() {
            r1 = this;
            java.lang.String r0 = r1.img
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

    public final java.lang.String getInfo_img() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.immutable_data
            java.lang.String r1 = "info_img"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.toString()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String getTemplate_id() {
            r1 = this;
            java.lang.String r0 = r1.template_id
            return r0
    }

    public final java.lang.String getVideo() {
            r1 = this;
            java.lang.String r0 = r1.video
            return r0
    }

    public final java.lang.String getVideoURL() {
            r4 = this;
            java.lang.String r0 = r4.video
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r1 = 2
            java.lang.String r2 = "http"
            r3 = 0
            boolean r0 = p362uh.C6463i.m13061R(r0, r2, r3, r1)
            if (r0 == 0) goto L13
            java.lang.String r0 = r4.video
            return r0
        L13:
            java.lang.String r0 = r4.video
            if (r0 == 0) goto L1d
            boolean r0 = p362uh.C6463i.m13054K(r0)
            if (r0 == 0) goto L1e
        L1d:
            r3 = 1
        L1e:
            if (r3 == 0) goto L23
            java.lang.String r0 = ""
            goto L32
        L23:
            java.lang.String r0 = "https://cdn.tacocrypto.io/default/resize:fit:400:400:0/plain/"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r4.video
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L32:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.template_id
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.name
            r2 = 0
            if (r1 != 0) goto Lf
            r1 = 0
            goto L13
        Lf:
            int r1 = r1.hashCode()
        L13:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.img
            if (r1 != 0) goto L1c
            r1 = 0
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.video
            if (r1 != 0) goto L28
            goto L2c
        L28:
            int r2 = r1.hashCode()
        L2c:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.immutable_data
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "NFTDetailUI(template_id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.template_id
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", img="
            r0.append(r1)
            java.lang.String r1 = r2.img
            r0.append(r1)
            java.lang.String r1 = ", video="
            r0.append(r1)
            java.lang.String r1 = r2.video
            r0.append(r1)
            java.lang.String r1 = ", immutable_data="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.immutable_data
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
