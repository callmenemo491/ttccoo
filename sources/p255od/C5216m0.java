package p255od;

/* renamed from: od.m0 */
/* loaded from: classes.dex */
public final class C5216m0 {
    private final java.lang.String album;
    private final java.lang.String author;
    private final java.lang.String cover;
    private final double duration;

    /* renamed from: id */
    private final int f20349id;
    private final java.lang.String name;
    private final java.lang.String url;
    private final int year;

    public C5216m0(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, double r8, int r10) {
            r1 = this;
            java.lang.String r0 = "name"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "author"
            p214m2.C4339q.m9706k(r4, r0)
            java.lang.String r0 = "album"
            p214m2.C4339q.m9706k(r5, r0)
            java.lang.String r0 = "cover"
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "url"
            p214m2.C4339q.m9706k(r7, r0)
            r1.<init>()
            r1.f20349id = r2
            r1.name = r3
            r1.author = r4
            r1.album = r5
            r1.cover = r6
            r1.url = r7
            r1.duration = r8
            r1.year = r10
            return
    }

    public static /* synthetic */ p255od.C5216m0 copy$default(p255od.C5216m0 r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, double r17, int r19, int r20, java.lang.Object r21) {
            r0 = r10
            r1 = r20
            r2 = r1 & 1
            if (r2 == 0) goto La
            int r2 = r0.f20349id
            goto Lb
        La:
            r2 = r11
        Lb:
            r3 = r1 & 2
            if (r3 == 0) goto L12
            java.lang.String r3 = r0.name
            goto L13
        L12:
            r3 = r12
        L13:
            r4 = r1 & 4
            if (r4 == 0) goto L1a
            java.lang.String r4 = r0.author
            goto L1b
        L1a:
            r4 = r13
        L1b:
            r5 = r1 & 8
            if (r5 == 0) goto L22
            java.lang.String r5 = r0.album
            goto L23
        L22:
            r5 = r14
        L23:
            r6 = r1 & 16
            if (r6 == 0) goto L2a
            java.lang.String r6 = r0.cover
            goto L2b
        L2a:
            r6 = r15
        L2b:
            r7 = r1 & 32
            if (r7 == 0) goto L32
            java.lang.String r7 = r0.url
            goto L34
        L32:
            r7 = r16
        L34:
            r8 = r1 & 64
            if (r8 == 0) goto L3b
            double r8 = r0.duration
            goto L3d
        L3b:
            r8 = r17
        L3d:
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L44
            int r1 = r0.year
            goto L46
        L44:
            r1 = r19
        L46:
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r19 = r1
            od.m0 r0 = r10.copy(r11, r12, r13, r14, r15, r16, r17, r19)
            return r0
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.f20349id
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.author
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.album
            return r0
    }

    public final java.lang.String component5() {
            r1 = this;
            java.lang.String r0 = r1.cover
            return r0
    }

    public final java.lang.String component6() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public final double component7() {
            r2 = this;
            double r0 = r2.duration
            return r0
    }

    public final int component8() {
            r1 = this;
            int r0 = r1.year
            return r0
    }

    public final p255od.C5216m0 copy(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, double r18, int r20) {
            r11 = this;
            java.lang.String r0 = "name"
            r3 = r13
            p214m2.C4339q.m9706k(r13, r0)
            java.lang.String r0 = "author"
            r4 = r14
            p214m2.C4339q.m9706k(r14, r0)
            java.lang.String r0 = "album"
            r5 = r15
            p214m2.C4339q.m9706k(r15, r0)
            java.lang.String r0 = "cover"
            r6 = r16
            p214m2.C4339q.m9706k(r6, r0)
            java.lang.String r0 = "url"
            r7 = r17
            p214m2.C4339q.m9706k(r7, r0)
            od.m0 r0 = new od.m0
            r1 = r0
            r2 = r12
            r8 = r18
            r10 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p255od.C5216m0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.m0 r6 = (p255od.C5216m0) r6
            int r1 = r5.f20349id
            int r3 = r6.f20349id
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r5.name
            java.lang.String r3 = r6.name
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r5.author
            java.lang.String r3 = r6.author
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r5.album
            java.lang.String r3 = r6.album
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r5.cover
            java.lang.String r3 = r6.cover
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.String r1 = r5.url
            java.lang.String r3 = r6.url
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            double r3 = r5.duration
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            double r3 = r6.duration
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L5d
            return r2
        L5d:
            int r1 = r5.year
            int r6 = r6.year
            if (r1 == r6) goto L64
            return r2
        L64:
            return r0
    }

    public final java.lang.String getAlbum() {
            r1 = this;
            java.lang.String r0 = r1.album
            return r0
    }

    public final java.lang.String getAuthor() {
            r1 = this;
            java.lang.String r0 = r1.author
            return r0
    }

    public final java.lang.String getCover() {
            r1 = this;
            java.lang.String r0 = r1.cover
            return r0
    }

    public final double getDuration() {
            r2 = this;
            double r0 = r2.duration
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.f20349id
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public final int getYear() {
            r1 = this;
            int r0 = r1.year
            return r0
    }

    public int hashCode() {
            r5 = this;
            int r0 = r5.f20349id
            int r0 = r0 * 31
            java.lang.String r1 = r5.name
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.author
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.album
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.cover
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            java.lang.String r1 = r5.url
            int r0 = p213m1.C4319e.m9651a(r1, r0, r2)
            double r1 = r5.duration
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r3 = 32
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r5.year
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "SongTaco(id="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f20349id
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", author="
            r0.append(r1)
            java.lang.String r1 = r3.author
            r0.append(r1)
            java.lang.String r1 = ", album="
            r0.append(r1)
            java.lang.String r1 = r3.album
            r0.append(r1)
            java.lang.String r1 = ", cover="
            r0.append(r1)
            java.lang.String r1 = r3.cover
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            java.lang.String r1 = r3.url
            r0.append(r1)
            java.lang.String r1 = ", duration="
            r0.append(r1)
            double r1 = r3.duration
            r0.append(r1)
            java.lang.String r1 = ", year="
            r0.append(r1)
            int r1 = r3.year
            r2 = 41
            java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
            return r0
    }
}
