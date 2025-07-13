package p269p5;

/* renamed from: p5.f */
/* loaded from: classes.dex */
public final class C5365f {

    /* renamed from: a */
    public java.lang.String f21341a;

    /* renamed from: b */
    public int f21342b;

    /* renamed from: c */
    public boolean f21343c;

    /* renamed from: d */
    public int f21344d;

    /* renamed from: e */
    public boolean f21345e;

    /* renamed from: f */
    public int f21346f;

    /* renamed from: g */
    public int f21347g;

    /* renamed from: h */
    public int f21348h;

    /* renamed from: i */
    public int f21349i;

    /* renamed from: j */
    public int f21350j;

    /* renamed from: k */
    public float f21351k;

    /* renamed from: l */
    public java.lang.String f21352l;

    /* renamed from: m */
    public int f21353m;

    /* renamed from: n */
    public int f21354n;

    /* renamed from: o */
    public android.text.Layout.Alignment f21355o;

    /* renamed from: p */
    public android.text.Layout.Alignment f21356p;

    /* renamed from: q */
    public int f21357q;

    /* renamed from: r */
    public p269p5.C5361b f21358r;

    /* renamed from: s */
    public float f21359s;

    public C5365f() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f21346f = r0
            r1.f21347g = r0
            r1.f21348h = r0
            r1.f21349i = r0
            r1.f21350j = r0
            r1.f21353m = r0
            r1.f21354n = r0
            r1.f21357q = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1.f21359s = r0
            return
    }

    /* renamed from: a */
    public p269p5.C5365f m11689a(p269p5.C5365f r5) {
            r4 = this;
            if (r5 == 0) goto L99
            boolean r0 = r4.f21343c
            r1 = 1
            if (r0 != 0) goto L11
            boolean r0 = r5.f21343c
            if (r0 == 0) goto L11
            int r0 = r5.f21342b
            r4.f21342b = r0
            r4.f21343c = r1
        L11:
            int r0 = r4.f21348h
            r2 = -1
            if (r0 != r2) goto L1a
            int r0 = r5.f21348h
            r4.f21348h = r0
        L1a:
            int r0 = r4.f21349i
            if (r0 != r2) goto L22
            int r0 = r5.f21349i
            r4.f21349i = r0
        L22:
            java.lang.String r0 = r4.f21341a
            if (r0 != 0) goto L2c
            java.lang.String r0 = r5.f21341a
            if (r0 == 0) goto L2c
            r4.f21341a = r0
        L2c:
            int r0 = r4.f21346f
            if (r0 != r2) goto L34
            int r0 = r5.f21346f
            r4.f21346f = r0
        L34:
            int r0 = r4.f21347g
            if (r0 != r2) goto L3c
            int r0 = r5.f21347g
            r4.f21347g = r0
        L3c:
            int r0 = r4.f21354n
            if (r0 != r2) goto L44
            int r0 = r5.f21354n
            r4.f21354n = r0
        L44:
            android.text.Layout$Alignment r0 = r4.f21355o
            if (r0 != 0) goto L4e
            android.text.Layout$Alignment r0 = r5.f21355o
            if (r0 == 0) goto L4e
            r4.f21355o = r0
        L4e:
            android.text.Layout$Alignment r0 = r4.f21356p
            if (r0 != 0) goto L58
            android.text.Layout$Alignment r0 = r5.f21356p
            if (r0 == 0) goto L58
            r4.f21356p = r0
        L58:
            int r0 = r4.f21357q
            if (r0 != r2) goto L60
            int r0 = r5.f21357q
            r4.f21357q = r0
        L60:
            int r0 = r4.f21350j
            if (r0 != r2) goto L6c
            int r0 = r5.f21350j
            r4.f21350j = r0
            float r0 = r5.f21351k
            r4.f21351k = r0
        L6c:
            p5.b r0 = r4.f21358r
            if (r0 != 0) goto L74
            p5.b r0 = r5.f21358r
            r4.f21358r = r0
        L74:
            float r0 = r4.f21359s
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L81
            float r0 = r5.f21359s
            r4.f21359s = r0
        L81:
            boolean r0 = r4.f21345e
            if (r0 != 0) goto L8f
            boolean r0 = r5.f21345e
            if (r0 == 0) goto L8f
            int r0 = r5.f21344d
            r4.f21344d = r0
            r4.f21345e = r1
        L8f:
            int r0 = r4.f21353m
            if (r0 != r2) goto L99
            int r5 = r5.f21353m
            if (r5 == r2) goto L99
            r4.f21353m = r5
        L99:
            return r4
    }

    /* renamed from: b */
    public int m11690b() {
            r4 = this;
            int r0 = r4.f21348h
            r1 = -1
            if (r0 != r1) goto La
            int r2 = r4.f21349i
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
            int r3 = r4.f21349i
            if (r3 != r2) goto L16
            r1 = 2
        L16:
            r0 = r0 | r1
            return r0
    }
}
