package p305r5;

/* renamed from: r5.c */
/* loaded from: classes.dex */
public final class C5790c {

    /* renamed from: a */
    public java.lang.String f22427a;

    /* renamed from: b */
    public java.lang.String f22428b;

    /* renamed from: c */
    public java.util.Set<java.lang.String> f22429c;

    /* renamed from: d */
    public java.lang.String f22430d;

    /* renamed from: e */
    public java.lang.String f22431e;

    /* renamed from: f */
    public int f22432f;

    /* renamed from: g */
    public boolean f22433g;

    /* renamed from: h */
    public int f22434h;

    /* renamed from: i */
    public boolean f22435i;

    /* renamed from: j */
    public int f22436j;

    /* renamed from: k */
    public int f22437k;

    /* renamed from: l */
    public int f22438l;

    /* renamed from: m */
    public int f22439m;

    /* renamed from: n */
    public int f22440n;

    /* renamed from: o */
    public float f22441o;

    /* renamed from: p */
    public int f22442p;

    /* renamed from: q */
    public boolean f22443q;

    public C5790c() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.f22427a = r0
            r2.f22428b = r0
            java.util.Set r1 = java.util.Collections.emptySet()
            r2.f22429c = r1
            r2.f22430d = r0
            r0 = 0
            r2.f22431e = r0
            r0 = 0
            r2.f22433g = r0
            r2.f22435i = r0
            r1 = -1
            r2.f22436j = r1
            r2.f22437k = r1
            r2.f22438l = r1
            r2.f22439m = r1
            r2.f22440n = r1
            r2.f22442p = r1
            r2.f22443q = r0
            return
    }

    /* renamed from: b */
    public static int m12146b(int r1, java.lang.String r2, java.lang.String r3, int r4) {
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L13
            r0 = -1
            if (r1 != r0) goto La
            goto L13
        La:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L12
            int r0 = r1 + r4
        L12:
            return r0
        L13:
            return r1
    }

    /* renamed from: a */
    public int m12147a() {
            r4 = this;
            int r0 = r4.f22438l
            r1 = -1
            if (r0 != r1) goto La
            int r2 = r4.f22439m
            if (r2 != r1) goto La
            return r1
        La:
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            int r3 = r4.f22439m
            if (r3 != r2) goto L16
            r1 = 2
        L16:
            r0 = r0 | r1
            return r0
    }
}
