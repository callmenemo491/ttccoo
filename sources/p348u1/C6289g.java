package p348u1;

/* renamed from: u1.g */
/* loaded from: classes.dex */
public class C6289g extends p348u1.AbstractC6288f {

    /* renamed from: h0 */
    public static final android.graphics.PorterDuff.Mode f24468h0 = null;

    /* renamed from: Z */
    public p348u1.C6289g.h f24469Z;

    /* renamed from: a0 */
    public android.graphics.PorterDuffColorFilter f24470a0;

    /* renamed from: b0 */
    public android.graphics.ColorFilter f24471b0;

    /* renamed from: c0 */
    public boolean f24472c0;

    /* renamed from: d0 */
    public boolean f24473d0;

    /* renamed from: e0 */
    public final float[] f24474e0;

    /* renamed from: f0 */
    public final android.graphics.Matrix f24475f0;

    /* renamed from: g0 */
    public final android.graphics.Rect f24476g0;

    /* renamed from: u1.g$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: u1.g$b */
    public static class b extends p348u1.C6289g.f {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public b(p348u1.C6289g.b r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: u1.g$c */
    public static class c extends p348u1.C6289g.f {

        /* renamed from: e */
        public int[] f24477e;

        /* renamed from: f */
        public p065e0.C1500e f24478f;

        /* renamed from: g */
        public float f24479g;

        /* renamed from: h */
        public p065e0.C1500e f24480h;

        /* renamed from: i */
        public float f24481i;

        /* renamed from: j */
        public float f24482j;

        /* renamed from: k */
        public float f24483k;

        /* renamed from: l */
        public float f24484l;

        /* renamed from: m */
        public float f24485m;

        /* renamed from: n */
        public android.graphics.Paint.Cap f24486n;

        /* renamed from: o */
        public android.graphics.Paint.Join f24487o;

        /* renamed from: p */
        public float f24488p;

        public c() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f24479g = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.f24481i = r1
                r2.f24482j = r1
                r2.f24483k = r0
                r2.f24484l = r1
                r2.f24485m = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r2.f24486n = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r2.f24487o = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r2.f24488p = r0
                return
        }

        public c(p348u1.C6289g.c r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = 0
                r2.f24479g = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.f24481i = r1
                r2.f24482j = r1
                r2.f24483k = r0
                r2.f24484l = r1
                r2.f24485m = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r2.f24486n = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r2.f24487o = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r2.f24488p = r0
                int[] r0 = r3.f24477e
                r2.f24477e = r0
                e0.e r0 = r3.f24478f
                r2.f24478f = r0
                float r0 = r3.f24479g
                r2.f24479g = r0
                float r0 = r3.f24481i
                r2.f24481i = r0
                e0.e r0 = r3.f24480h
                r2.f24480h = r0
                int r0 = r3.f24504c
                r2.f24504c = r0
                float r0 = r3.f24482j
                r2.f24482j = r0
                float r0 = r3.f24483k
                r2.f24483k = r0
                float r0 = r3.f24484l
                r2.f24484l = r0
                float r0 = r3.f24485m
                r2.f24485m = r0
                android.graphics.Paint$Cap r0 = r3.f24486n
                r2.f24486n = r0
                android.graphics.Paint$Join r0 = r3.f24487o
                r2.f24487o = r0
                float r3 = r3.f24488p
                r2.f24488p = r3
                return
        }

        @Override // p348u1.C6289g.e
        /* renamed from: a */
        public boolean mo12918a() {
                r1 = this;
                e0.e r0 = r1.f24480h
                boolean r0 = r0.m4076c()
                if (r0 != 0) goto L13
                e0.e r0 = r1.f24478f
                boolean r0 = r0.m4076c()
                if (r0 == 0) goto L11
                goto L13
            L11:
                r0 = 0
                goto L14
            L13:
                r0 = 1
            L14:
                return r0
        }

        @Override // p348u1.C6289g.e
        /* renamed from: b */
        public boolean mo12919b(int[] r3) {
                r2 = this;
                e0.e r0 = r2.f24480h
                boolean r0 = r0.m4077d(r3)
                e0.e r1 = r2.f24478f
                boolean r3 = r1.m4077d(r3)
                r3 = r3 | r0
                return r3
        }

        public float getFillAlpha() {
                r1 = this;
                float r0 = r1.f24482j
                return r0
        }

        public int getFillColor() {
                r1 = this;
                e0.e r0 = r1.f24480h
                int r0 = r0.f7300c
                return r0
        }

        public float getStrokeAlpha() {
                r1 = this;
                float r0 = r1.f24481i
                return r0
        }

        public int getStrokeColor() {
                r1 = this;
                e0.e r0 = r1.f24478f
                int r0 = r0.f7300c
                return r0
        }

        public float getStrokeWidth() {
                r1 = this;
                float r0 = r1.f24479g
                return r0
        }

        public float getTrimPathEnd() {
                r1 = this;
                float r0 = r1.f24484l
                return r0
        }

        public float getTrimPathOffset() {
                r1 = this;
                float r0 = r1.f24485m
                return r0
        }

        public float getTrimPathStart() {
                r1 = this;
                float r0 = r1.f24483k
                return r0
        }

        public void setFillAlpha(float r1) {
                r0 = this;
                r0.f24482j = r1
                return
        }

        public void setFillColor(int r2) {
                r1 = this;
                e0.e r0 = r1.f24480h
                r0.f7300c = r2
                return
        }

        public void setStrokeAlpha(float r1) {
                r0 = this;
                r0.f24481i = r1
                return
        }

        public void setStrokeColor(int r2) {
                r1 = this;
                e0.e r0 = r1.f24478f
                r0.f7300c = r2
                return
        }

        public void setStrokeWidth(float r1) {
                r0 = this;
                r0.f24479g = r1
                return
        }

        public void setTrimPathEnd(float r1) {
                r0 = this;
                r0.f24484l = r1
                return
        }

        public void setTrimPathOffset(float r1) {
                r0 = this;
                r0.f24485m = r1
                return
        }

        public void setTrimPathStart(float r1) {
                r0 = this;
                r0.f24483k = r1
                return
        }
    }

    /* renamed from: u1.g$d */
    public static class d extends p348u1.C6289g.e {

        /* renamed from: a */
        public final android.graphics.Matrix f24489a;

        /* renamed from: b */
        public final java.util.ArrayList<p348u1.C6289g.e> f24490b;

        /* renamed from: c */
        public float f24491c;

        /* renamed from: d */
        public float f24492d;

        /* renamed from: e */
        public float f24493e;

        /* renamed from: f */
        public float f24494f;

        /* renamed from: g */
        public float f24495g;

        /* renamed from: h */
        public float f24496h;

        /* renamed from: i */
        public float f24497i;

        /* renamed from: j */
        public final android.graphics.Matrix f24498j;

        /* renamed from: k */
        public int f24499k;

        /* renamed from: l */
        public int[] f24500l;

        /* renamed from: m */
        public java.lang.String f24501m;

        public d() {
                r3 = this;
                r0 = 0
                r3.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.f24489a = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r3.f24490b = r1
                r1 = 0
                r3.f24491c = r1
                r3.f24492d = r1
                r3.f24493e = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r3.f24494f = r2
                r3.f24495g = r2
                r3.f24496h = r1
                r3.f24497i = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.f24498j = r1
                r3.f24501m = r0
                return
        }

        public d(p348u1.C6289g.d r5, p319s.C5934a<java.lang.String, java.lang.Object> r6) {
                r4 = this;
                r0 = 0
                r4.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r4.f24489a = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r4.f24490b = r1
                r1 = 0
                r4.f24491c = r1
                r4.f24492d = r1
                r4.f24493e = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r4.f24494f = r2
                r4.f24495g = r2
                r4.f24496h = r1
                r4.f24497i = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r4.f24498j = r1
                r4.f24501m = r0
                float r0 = r5.f24491c
                r4.f24491c = r0
                float r0 = r5.f24492d
                r4.f24492d = r0
                float r0 = r5.f24493e
                r4.f24493e = r0
                float r0 = r5.f24494f
                r4.f24494f = r0
                float r0 = r5.f24495g
                r4.f24495g = r0
                float r0 = r5.f24496h
                r4.f24496h = r0
                float r0 = r5.f24497i
                r4.f24497i = r0
                int[] r0 = r5.f24500l
                r4.f24500l = r0
                java.lang.String r0 = r5.f24501m
                r4.f24501m = r0
                int r2 = r5.f24499k
                r4.f24499k = r2
                if (r0 == 0) goto L59
                r6.put(r0, r4)
            L59:
                android.graphics.Matrix r0 = r5.f24498j
                r1.set(r0)
                java.util.ArrayList<u1.g$e> r5 = r5.f24490b
                r0 = 0
            L61:
                int r1 = r5.size()
                if (r0 >= r1) goto Laa
                java.lang.Object r1 = r5.get(r0)
                boolean r2 = r1 instanceof p348u1.C6289g.d
                if (r2 == 0) goto L7c
                u1.g$d r1 = (p348u1.C6289g.d) r1
                java.util.ArrayList<u1.g$e> r2 = r4.f24490b
                u1.g$d r3 = new u1.g$d
                r3.<init>(r1, r6)
                r2.add(r3)
                goto L9f
            L7c:
                boolean r2 = r1 instanceof p348u1.C6289g.c
                if (r2 == 0) goto L88
                u1.g$c r2 = new u1.g$c
                u1.g$c r1 = (p348u1.C6289g.c) r1
                r2.<init>(r1)
                goto L93
            L88:
                boolean r2 = r1 instanceof p348u1.C6289g.b
                if (r2 == 0) goto La2
                u1.g$b r2 = new u1.g$b
                u1.g$b r1 = (p348u1.C6289g.b) r1
                r2.<init>(r1)
            L93:
                java.util.ArrayList<u1.g$e> r1 = r4.f24490b
                r1.add(r2)
                java.lang.String r1 = r2.f24503b
                if (r1 == 0) goto L9f
                r6.put(r1, r2)
            L9f:
                int r0 = r0 + 1
                goto L61
            La2:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Unknown object in the tree!"
                r5.<init>(r6)
                throw r5
            Laa:
                return
        }

        @Override // p348u1.C6289g.e
        /* renamed from: a */
        public boolean mo12918a() {
                r3 = this;
                r0 = 0
                r1 = 0
            L2:
                java.util.ArrayList<u1.g$e> r2 = r3.f24490b
                int r2 = r2.size()
                if (r1 >= r2) goto L1d
                java.util.ArrayList<u1.g$e> r2 = r3.f24490b
                java.lang.Object r2 = r2.get(r1)
                u1.g$e r2 = (p348u1.C6289g.e) r2
                boolean r2 = r2.mo12918a()
                if (r2 == 0) goto L1a
                r0 = 1
                return r0
            L1a:
                int r1 = r1 + 1
                goto L2
            L1d:
                return r0
        }

        @Override // p348u1.C6289g.e
        /* renamed from: b */
        public boolean mo12919b(int[] r4) {
                r3 = this;
                r0 = 0
                r1 = 0
            L2:
                java.util.ArrayList<u1.g$e> r2 = r3.f24490b
                int r2 = r2.size()
                if (r0 >= r2) goto L1a
                java.util.ArrayList<u1.g$e> r2 = r3.f24490b
                java.lang.Object r2 = r2.get(r0)
                u1.g$e r2 = (p348u1.C6289g.e) r2
                boolean r2 = r2.mo12919b(r4)
                r1 = r1 | r2
                int r0 = r0 + 1
                goto L2
            L1a:
                return r1
        }

        /* renamed from: c */
        public final void m12920c() {
                r4 = this;
                android.graphics.Matrix r0 = r4.f24498j
                r0.reset()
                android.graphics.Matrix r0 = r4.f24498j
                float r1 = r4.f24492d
                float r1 = -r1
                float r2 = r4.f24493e
                float r2 = -r2
                r0.postTranslate(r1, r2)
                android.graphics.Matrix r0 = r4.f24498j
                float r1 = r4.f24494f
                float r2 = r4.f24495g
                r0.postScale(r1, r2)
                android.graphics.Matrix r0 = r4.f24498j
                float r1 = r4.f24491c
                r2 = 0
                r0.postRotate(r1, r2, r2)
                android.graphics.Matrix r0 = r4.f24498j
                float r1 = r4.f24496h
                float r2 = r4.f24492d
                float r1 = r1 + r2
                float r2 = r4.f24497i
                float r3 = r4.f24493e
                float r2 = r2 + r3
                r0.postTranslate(r1, r2)
                return
        }

        public java.lang.String getGroupName() {
                r1 = this;
                java.lang.String r0 = r1.f24501m
                return r0
        }

        public android.graphics.Matrix getLocalMatrix() {
                r1 = this;
                android.graphics.Matrix r0 = r1.f24498j
                return r0
        }

        public float getPivotX() {
                r1 = this;
                float r0 = r1.f24492d
                return r0
        }

        public float getPivotY() {
                r1 = this;
                float r0 = r1.f24493e
                return r0
        }

        public float getRotation() {
                r1 = this;
                float r0 = r1.f24491c
                return r0
        }

        public float getScaleX() {
                r1 = this;
                float r0 = r1.f24494f
                return r0
        }

        public float getScaleY() {
                r1 = this;
                float r0 = r1.f24495g
                return r0
        }

        public float getTranslateX() {
                r1 = this;
                float r0 = r1.f24496h
                return r0
        }

        public float getTranslateY() {
                r1 = this;
                float r0 = r1.f24497i
                return r0
        }

        public void setPivotX(float r2) {
                r1 = this;
                float r0 = r1.f24492d
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f24492d = r2
                r1.m12920c()
            Lb:
                return
        }

        public void setPivotY(float r2) {
                r1 = this;
                float r0 = r1.f24493e
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f24493e = r2
                r1.m12920c()
            Lb:
                return
        }

        public void setRotation(float r2) {
                r1 = this;
                float r0 = r1.f24491c
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f24491c = r2
                r1.m12920c()
            Lb:
                return
        }

        public void setScaleX(float r2) {
                r1 = this;
                float r0 = r1.f24494f
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f24494f = r2
                r1.m12920c()
            Lb:
                return
        }

        public void setScaleY(float r2) {
                r1 = this;
                float r0 = r1.f24495g
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f24495g = r2
                r1.m12920c()
            Lb:
                return
        }

        public void setTranslateX(float r2) {
                r1 = this;
                float r0 = r1.f24496h
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f24496h = r2
                r1.m12920c()
            Lb:
                return
        }

        public void setTranslateY(float r2) {
                r1 = this;
                float r0 = r1.f24497i
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.f24497i = r2
                r1.m12920c()
            Lb:
                return
        }
    }

    /* renamed from: u1.g$e */
    public static abstract class e {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        public e(p348u1.C6289g.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public boolean mo12918a() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* renamed from: b */
        public boolean mo12919b(int[] r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* renamed from: u1.g$f */
    public static abstract class f extends p348u1.C6289g.e {

        /* renamed from: a */
        public p084f0.C1941d.a[] f24502a;

        /* renamed from: b */
        public java.lang.String f24503b;

        /* renamed from: c */
        public int f24504c;

        /* renamed from: d */
        public int f24505d;

        public f() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f24502a = r0
                r0 = 0
                r1.f24504c = r0
                return
        }

        public f(p348u1.C6289g.f r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.f24502a = r0
                r0 = 0
                r1.f24504c = r0
                java.lang.String r0 = r2.f24503b
                r1.f24503b = r0
                int r0 = r2.f24505d
                r1.f24505d = r0
                f0.d$a[] r2 = r2.f24502a
                f0.d$a[] r2 = p084f0.C1941d.m4834e(r2)
                r1.f24502a = r2
                return
        }

        public p084f0.C1941d.a[] getPathData() {
                r1 = this;
                f0.d$a[] r0 = r1.f24502a
                return r0
        }

        public java.lang.String getPathName() {
                r1 = this;
                java.lang.String r0 = r1.f24503b
                return r0
        }

        public void setPathData(p084f0.C1941d.a[] r7) {
                r6 = this;
                f0.d$a[] r0 = r6.f24502a
                boolean r0 = p084f0.C1941d.m4830a(r0, r7)
                if (r0 != 0) goto Lf
                f0.d$a[] r7 = p084f0.C1941d.m4834e(r7)
                r6.f24502a = r7
                goto L38
            Lf:
                f0.d$a[] r0 = r6.f24502a
                r1 = 0
                r2 = 0
            L13:
                int r3 = r7.length
                if (r2 >= r3) goto L38
                r3 = r0[r2]
                r4 = r7[r2]
                char r4 = r4.f8485a
                r3.f8485a = r4
                r3 = 0
            L1f:
                r4 = r7[r2]
                float[] r4 = r4.f8486b
                int r4 = r4.length
                if (r3 >= r4) goto L35
                r4 = r0[r2]
                float[] r4 = r4.f8486b
                r5 = r7[r2]
                float[] r5 = r5.f8486b
                r5 = r5[r3]
                r4[r3] = r5
                int r3 = r3 + 1
                goto L1f
            L35:
                int r2 = r2 + 1
                goto L13
            L38:
                return
        }
    }

    /* renamed from: u1.g$g */
    public static class g {

        /* renamed from: q */
        public static final android.graphics.Matrix f24506q = null;

        /* renamed from: a */
        public final android.graphics.Path f24507a;

        /* renamed from: b */
        public final android.graphics.Path f24508b;

        /* renamed from: c */
        public final android.graphics.Matrix f24509c;

        /* renamed from: d */
        public android.graphics.Paint f24510d;

        /* renamed from: e */
        public android.graphics.Paint f24511e;

        /* renamed from: f */
        public android.graphics.PathMeasure f24512f;

        /* renamed from: g */
        public int f24513g;

        /* renamed from: h */
        public final p348u1.C6289g.d f24514h;

        /* renamed from: i */
        public float f24515i;

        /* renamed from: j */
        public float f24516j;

        /* renamed from: k */
        public float f24517k;

        /* renamed from: l */
        public float f24518l;

        /* renamed from: m */
        public int f24519m;

        /* renamed from: n */
        public java.lang.String f24520n;

        /* renamed from: o */
        public java.lang.Boolean f24521o;

        /* renamed from: p */
        public final p319s.C5934a<java.lang.String, java.lang.Object> f24522p;

        static {
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                p348u1.C6289g.g.f24506q = r0
                return
        }

        public g() {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.f24509c = r0
                r0 = 0
                r1.f24515i = r0
                r1.f24516j = r0
                r1.f24517k = r0
                r1.f24518l = r0
                r0 = 255(0xff, float:3.57E-43)
                r1.f24519m = r0
                r0 = 0
                r1.f24520n = r0
                r1.f24521o = r0
                s.a r0 = new s.a
                r0.<init>()
                r1.f24522p = r0
                u1.g$d r0 = new u1.g$d
                r0.<init>()
                r1.f24514h = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.f24507a = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.f24508b = r0
                return
        }

        public g(p348u1.C6289g.g r4) {
                r3 = this;
                r3.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r3.f24509c = r0
                r0 = 0
                r3.f24515i = r0
                r3.f24516j = r0
                r3.f24517k = r0
                r3.f24518l = r0
                r0 = 255(0xff, float:3.57E-43)
                r3.f24519m = r0
                r0 = 0
                r3.f24520n = r0
                r3.f24521o = r0
                s.a r0 = new s.a
                r0.<init>()
                r3.f24522p = r0
                u1.g$d r1 = new u1.g$d
                u1.g$d r2 = r4.f24514h
                r1.<init>(r2, r0)
                r3.f24514h = r1
                android.graphics.Path r1 = new android.graphics.Path
                android.graphics.Path r2 = r4.f24507a
                r1.<init>(r2)
                r3.f24507a = r1
                android.graphics.Path r1 = new android.graphics.Path
                android.graphics.Path r2 = r4.f24508b
                r1.<init>(r2)
                r3.f24508b = r1
                float r1 = r4.f24515i
                r3.f24515i = r1
                float r1 = r4.f24516j
                r3.f24516j = r1
                float r1 = r4.f24517k
                r3.f24517k = r1
                float r1 = r4.f24518l
                r3.f24518l = r1
                int r1 = r4.f24513g
                r3.f24513g = r1
                int r1 = r4.f24519m
                r3.f24519m = r1
                java.lang.String r1 = r4.f24520n
                r3.f24520n = r1
                java.lang.String r1 = r4.f24520n
                if (r1 == 0) goto L61
                r0.put(r1, r3)
            L61:
                java.lang.Boolean r4 = r4.f24521o
                r3.f24521o = r4
                return
        }

        /* renamed from: a */
        public final void m12921a(p348u1.C6289g.d r18, android.graphics.Matrix r19, android.graphics.Canvas r20, int r21, int r22, android.graphics.ColorFilter r23) {
                r17 = this;
                r7 = r17
                r8 = r18
                r9 = r20
                r10 = r23
                android.graphics.Matrix r0 = r8.f24489a
                r1 = r19
                r0.set(r1)
                android.graphics.Matrix r0 = r8.f24489a
                android.graphics.Matrix r1 = r8.f24498j
                r0.preConcat(r1)
                r20.save()
                r11 = 0
                r12 = 0
            L1b:
                java.util.ArrayList<u1.g$e> r0 = r8.f24490b
                int r0 = r0.size()
                if (r12 >= r0) goto L24b
                java.util.ArrayList<u1.g$e> r0 = r8.f24490b
                java.lang.Object r0 = r0.get(r12)
                u1.g$e r0 = (p348u1.C6289g.e) r0
                boolean r1 = r0 instanceof p348u1.C6289g.d
                if (r1 == 0) goto L43
                r1 = r0
                u1.g$d r1 = (p348u1.C6289g.d) r1
                android.graphics.Matrix r2 = r8.f24489a
                r0 = r17
                r3 = r20
                r4 = r21
                r5 = r22
                r6 = r23
                r0.m12921a(r1, r2, r3, r4, r5, r6)
                goto L240
            L43:
                boolean r1 = r0 instanceof p348u1.C6289g.f
                if (r1 == 0) goto L240
                u1.g$f r0 = (p348u1.C6289g.f) r0
                r1 = r21
                float r2 = (float) r1
                float r3 = r7.f24517k
                float r2 = r2 / r3
                r3 = r22
                float r4 = (float) r3
                float r5 = r7.f24518l
                float r4 = r4 / r5
                float r5 = java.lang.Math.min(r2, r4)
                android.graphics.Matrix r6 = r8.f24489a
                android.graphics.Matrix r13 = r7.f24509c
                r13.set(r6)
                android.graphics.Matrix r13 = r7.f24509c
                r13.postScale(r2, r4)
                r2 = 4
                float[] r2 = new float[r2]
                r2 = {x0250: FILL_ARRAY_DATA , data: [0, 1065353216, 1065353216, 0} // fill-array
                r6.mapVectors(r2)
                r4 = r2[r11]
                double r13 = (double) r4
                r4 = 1
                r6 = r2[r4]
                r19 = r5
                double r4 = (double) r6
                double r4 = java.lang.Math.hypot(r13, r4)
                float r4 = (float) r4
                r5 = 2
                r6 = r2[r5]
                double r13 = (double) r6
                r6 = 3
                r15 = r2[r6]
                double r6 = (double) r15
                double r6 = java.lang.Math.hypot(r13, r6)
                float r6 = (float) r6
                r7 = r2[r11]
                r13 = 1
                r14 = r2[r13]
                r5 = r2[r5]
                r13 = 3
                r2 = r2[r13]
                float r7 = r7 * r2
                float r14 = r14 * r5
                float r7 = r7 - r14
                float r2 = java.lang.Math.max(r4, r6)
                r4 = 0
                int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r5 <= 0) goto La7
                float r5 = java.lang.Math.abs(r7)
                float r5 = r5 / r2
                goto La8
            La7:
                r5 = 0
            La8:
                int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r2 != 0) goto Lb0
                r2 = r17
                goto L245
            Lb0:
                r2 = r17
                android.graphics.Path r6 = r2.f24507a
                java.util.Objects.requireNonNull(r0)
                r6.reset()
                f0.d$a[] r7 = r0.f24502a
                if (r7 == 0) goto Lc1
                p084f0.C1941d.a.m4836b(r7, r6)
            Lc1:
                android.graphics.Path r6 = r2.f24507a
                android.graphics.Path r7 = r2.f24508b
                r7.reset()
                boolean r7 = r0 instanceof p348u1.C6289g.b
                if (r7 == 0) goto Le8
                android.graphics.Path r4 = r2.f24508b
                int r0 = r0.f24504c
                if (r0 != 0) goto Ld5
                android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
                goto Ld7
            Ld5:
                android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            Ld7:
                r4.setFillType(r0)
                android.graphics.Path r0 = r2.f24508b
                android.graphics.Matrix r4 = r2.f24509c
                r0.addPath(r6, r4)
                android.graphics.Path r0 = r2.f24508b
                r9.clipPath(r0)
                goto L245
            Le8:
                u1.g$c r0 = (p348u1.C6289g.c) r0
                float r7 = r0.f24483k
                r13 = 1065353216(0x3f800000, float:1.0)
                int r14 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r14 != 0) goto Lf8
                float r14 = r0.f24484l
                int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
                if (r14 == 0) goto L138
            Lf8:
                float r14 = r0.f24485m
                float r7 = r7 + r14
                float r7 = r7 % r13
                float r15 = r0.f24484l
                float r15 = r15 + r14
                float r15 = r15 % r13
                android.graphics.PathMeasure r13 = r2.f24512f
                if (r13 != 0) goto L10b
                android.graphics.PathMeasure r13 = new android.graphics.PathMeasure
                r13.<init>()
                r2.f24512f = r13
            L10b:
                android.graphics.PathMeasure r13 = r2.f24512f
                android.graphics.Path r14 = r2.f24507a
                r13.setPath(r14, r11)
                android.graphics.PathMeasure r13 = r2.f24512f
                float r13 = r13.getLength()
                float r7 = r7 * r13
                float r15 = r15 * r13
                r6.reset()
                int r14 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
                if (r14 <= 0) goto L12f
                android.graphics.PathMeasure r14 = r2.f24512f
                r11 = 1
                r14.getSegment(r7, r13, r6, r11)
                android.graphics.PathMeasure r7 = r2.f24512f
                r7.getSegment(r4, r15, r6, r11)
                goto L135
            L12f:
                r11 = 1
                android.graphics.PathMeasure r13 = r2.f24512f
                r13.getSegment(r7, r15, r6, r11)
            L135:
                r6.rLineTo(r4, r4)
            L138:
                android.graphics.Path r4 = r2.f24508b
                android.graphics.Matrix r7 = r2.f24509c
                r4.addPath(r6, r7)
                e0.e r4 = r0.f24480h
                boolean r6 = r4.m4075b()
                if (r6 != 0) goto L14e
                int r4 = r4.f7300c
                if (r4 == 0) goto L14c
                goto L14e
            L14c:
                r4 = 0
                goto L14f
            L14e:
                r4 = 1
            L14f:
                r6 = 1132396544(0x437f0000, float:255.0)
                r7 = 16777215(0xffffff, float:2.3509886E-38)
                r11 = 255(0xff, float:3.57E-43)
                r13 = 0
                if (r4 == 0) goto L1bb
                e0.e r4 = r0.f24480h
                android.graphics.Paint r14 = r2.f24511e
                if (r14 != 0) goto L16c
                android.graphics.Paint r14 = new android.graphics.Paint
                r15 = 1
                r14.<init>(r15)
                r2.f24511e = r14
                android.graphics.Paint$Style r15 = android.graphics.Paint.Style.FILL
                r14.setStyle(r15)
            L16c:
                android.graphics.Paint r14 = r2.f24511e
                boolean r15 = r4.m4075b()
                if (r15 == 0) goto L18a
                android.graphics.Shader r4 = r4.f7298a
                android.graphics.Matrix r15 = r2.f24509c
                r4.setLocalMatrix(r15)
                r14.setShader(r4)
                float r4 = r0.f24482j
                float r4 = r4 * r6
                int r4 = java.lang.Math.round(r4)
                r14.setAlpha(r4)
                goto L1a5
            L18a:
                r14.setShader(r13)
                r14.setAlpha(r11)
                int r4 = r4.f7300c
                float r15 = r0.f24482j
                android.graphics.PorterDuff$Mode r16 = p348u1.C6289g.f24468h0
                int r11 = android.graphics.Color.alpha(r4)
                r4 = r4 & r7
                float r11 = (float) r11
                float r11 = r11 * r15
                int r11 = (int) r11
                int r11 = r11 << 24
                r4 = r4 | r11
                r14.setColor(r4)
            L1a5:
                r14.setColorFilter(r10)
                android.graphics.Path r4 = r2.f24508b
                int r11 = r0.f24504c
                if (r11 != 0) goto L1b1
                android.graphics.Path$FillType r11 = android.graphics.Path.FillType.WINDING
                goto L1b3
            L1b1:
                android.graphics.Path$FillType r11 = android.graphics.Path.FillType.EVEN_ODD
            L1b3:
                r4.setFillType(r11)
                android.graphics.Path r4 = r2.f24508b
                r9.drawPath(r4, r14)
            L1bb:
                e0.e r4 = r0.f24478f
                boolean r11 = r4.m4075b()
                if (r11 != 0) goto L1ca
                int r4 = r4.f7300c
                if (r4 == 0) goto L1c8
                goto L1ca
            L1c8:
                r4 = 0
                goto L1cb
            L1ca:
                r4 = 1
            L1cb:
                if (r4 == 0) goto L245
                e0.e r4 = r0.f24478f
                android.graphics.Paint r11 = r2.f24510d
                if (r11 != 0) goto L1e0
                android.graphics.Paint r11 = new android.graphics.Paint
                r14 = 1
                r11.<init>(r14)
                r2.f24510d = r11
                android.graphics.Paint$Style r14 = android.graphics.Paint.Style.STROKE
                r11.setStyle(r14)
            L1e0:
                android.graphics.Paint r11 = r2.f24510d
                android.graphics.Paint$Join r14 = r0.f24487o
                if (r14 == 0) goto L1e9
                r11.setStrokeJoin(r14)
            L1e9:
                android.graphics.Paint$Cap r14 = r0.f24486n
                if (r14 == 0) goto L1f0
                r11.setStrokeCap(r14)
            L1f0:
                float r14 = r0.f24488p
                r11.setStrokeMiter(r14)
                boolean r14 = r4.m4075b()
                if (r14 == 0) goto L211
                android.graphics.Shader r4 = r4.f7298a
                android.graphics.Matrix r7 = r2.f24509c
                r4.setLocalMatrix(r7)
                r11.setShader(r4)
                float r4 = r0.f24481i
                float r4 = r4 * r6
                int r4 = java.lang.Math.round(r4)
                r11.setAlpha(r4)
                goto L22e
            L211:
                r11.setShader(r13)
                r6 = 255(0xff, float:3.57E-43)
                r11.setAlpha(r6)
                int r4 = r4.f7300c
                float r6 = r0.f24481i
                android.graphics.PorterDuff$Mode r13 = p348u1.C6289g.f24468h0
                int r13 = android.graphics.Color.alpha(r4)
                r4 = r4 & r7
                float r7 = (float) r13
                float r7 = r7 * r6
                int r6 = (int) r7
                int r6 = r6 << 24
                r4 = r4 | r6
                r11.setColor(r4)
            L22e:
                r11.setColorFilter(r10)
                float r5 = r5 * r19
                float r0 = r0.f24479g
                float r0 = r0 * r5
                r11.setStrokeWidth(r0)
                android.graphics.Path r0 = r2.f24508b
                r9.drawPath(r0, r11)
                goto L245
            L240:
                r1 = r21
                r3 = r22
                r2 = r7
            L245:
                int r12 = r12 + 1
                r7 = r2
                r11 = 0
                goto L1b
            L24b:
                r2 = r7
                r20.restore()
                return
        }

        public float getAlpha() {
                r2 = this;
                int r0 = r2.getRootAlpha()
                float r0 = (float) r0
                r1 = 1132396544(0x437f0000, float:255.0)
                float r0 = r0 / r1
                return r0
        }

        public int getRootAlpha() {
                r1 = this;
                int r0 = r1.f24519m
                return r0
        }

        public void setAlpha(float r2) {
                r1 = this;
                r0 = 1132396544(0x437f0000, float:255.0)
                float r2 = r2 * r0
                int r2 = (int) r2
                r1.setRootAlpha(r2)
                return
        }

        public void setRootAlpha(int r1) {
                r0 = this;
                r0.f24519m = r1
                return
        }
    }

    /* renamed from: u1.g$h */
    public static class h extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: a */
        public int f24523a;

        /* renamed from: b */
        public p348u1.C6289g.g f24524b;

        /* renamed from: c */
        public android.content.res.ColorStateList f24525c;

        /* renamed from: d */
        public android.graphics.PorterDuff.Mode f24526d;

        /* renamed from: e */
        public boolean f24527e;

        /* renamed from: f */
        public android.graphics.Bitmap f24528f;

        /* renamed from: g */
        public android.content.res.ColorStateList f24529g;

        /* renamed from: h */
        public android.graphics.PorterDuff.Mode f24530h;

        /* renamed from: i */
        public int f24531i;

        /* renamed from: j */
        public boolean f24532j;

        /* renamed from: k */
        public boolean f24533k;

        /* renamed from: l */
        public android.graphics.Paint f24534l;

        public h() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f24525c = r0
                android.graphics.PorterDuff$Mode r0 = p348u1.C6289g.f24468h0
                r1.f24526d = r0
                u1.g$g r0 = new u1.g$g
                r0.<init>()
                r1.f24524b = r0
                return
        }

        public h(p348u1.C6289g.h r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f24525c = r0
                android.graphics.PorterDuff$Mode r0 = p348u1.C6289g.f24468h0
                r3.f24526d = r0
                if (r4 == 0) goto L49
                int r0 = r4.f24523a
                r3.f24523a = r0
                u1.g$g r0 = new u1.g$g
                u1.g$g r1 = r4.f24524b
                r0.<init>(r1)
                r3.f24524b = r0
                u1.g$g r1 = r4.f24524b
                android.graphics.Paint r1 = r1.f24511e
                if (r1 == 0) goto L2a
                android.graphics.Paint r1 = new android.graphics.Paint
                u1.g$g r2 = r4.f24524b
                android.graphics.Paint r2 = r2.f24511e
                r1.<init>(r2)
                r0.f24511e = r1
            L2a:
                u1.g$g r0 = r4.f24524b
                android.graphics.Paint r0 = r0.f24510d
                if (r0 == 0) goto L3d
                u1.g$g r0 = r3.f24524b
                android.graphics.Paint r1 = new android.graphics.Paint
                u1.g$g r2 = r4.f24524b
                android.graphics.Paint r2 = r2.f24510d
                r1.<init>(r2)
                r0.f24510d = r1
            L3d:
                android.content.res.ColorStateList r0 = r4.f24525c
                r3.f24525c = r0
                android.graphics.PorterDuff$Mode r0 = r4.f24526d
                r3.f24526d = r0
                boolean r4 = r4.f24527e
                r3.f24527e = r4
            L49:
                return
        }

        /* renamed from: a */
        public boolean m12922a() {
                r2 = this;
                u1.g$g r0 = r2.f24524b
                java.lang.Boolean r1 = r0.f24521o
                if (r1 != 0) goto L12
                u1.g$d r1 = r0.f24514h
                boolean r1 = r1.mo12918a()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.f24521o = r1
            L12:
                java.lang.Boolean r0 = r0.f24521o
                boolean r0 = r0.booleanValue()
                return r0
        }

        /* renamed from: b */
        public void m12923b(int r10, int r11) {
                r9 = this;
                android.graphics.Bitmap r0 = r9.f24528f
                r1 = 0
                r0.eraseColor(r1)
                android.graphics.Canvas r5 = new android.graphics.Canvas
                android.graphics.Bitmap r0 = r9.f24528f
                r5.<init>(r0)
                u1.g$g r2 = r9.f24524b
                u1.g$d r3 = r2.f24514h
                android.graphics.Matrix r4 = p348u1.C6289g.g.f24506q
                r8 = 0
                r6 = r10
                r7 = r11
                r2.m12921a(r3, r4, r5, r6, r7, r8)
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.f24523a
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                u1.g r0 = new u1.g
                r0.<init>(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r1) {
                r0 = this;
                u1.g r1 = new u1.g
                r1.<init>(r0)
                return r1
        }
    }

    /* renamed from: u1.g$i */
    public static class i extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: a */
        public final android.graphics.drawable.Drawable.ConstantState f24535a;

        public i(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.f24535a = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f24535a
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.f24535a
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                u1.g r0 = new u1.g
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f24535a
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
                r0.f24467Y = r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                u1.g r0 = new u1.g
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f24535a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3)
                android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
                r0.f24467Y = r3
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                u1.g r0 = new u1.g
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.f24535a
                android.graphics.drawable.Drawable r3 = r1.newDrawable(r3, r4)
                android.graphics.drawable.VectorDrawable r3 = (android.graphics.drawable.VectorDrawable) r3
                r0.f24467Y = r3
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            p348u1.C6289g.f24468h0 = r0
            return
    }

    public C6289g() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f24473d0 = r0
            r0 = 9
            float[] r0 = new float[r0]
            r1.f24474e0 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f24475f0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f24476g0 = r0
            u1.g$h r0 = new u1.g$h
            r0.<init>()
            r1.f24469Z = r0
            return
    }

    public C6289g(p348u1.C6289g.h r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f24473d0 = r0
            r0 = 9
            float[] r0 = new float[r0]
            r1.f24474e0 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f24475f0 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f24476g0 = r0
            r1.f24469Z = r2
            android.content.res.ColorStateList r0 = r2.f24525c
            android.graphics.PorterDuff$Mode r2 = r2.f24526d
            android.graphics.PorterDuffColorFilter r2 = r1.m12917b(r0, r2)
            r1.f24470a0 = r2
            return
    }

    /* renamed from: a */
    public static p348u1.C6289g m12916a(android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) {
            u1.g r0 = new u1.g
            r0.<init>()
            r0.inflate(r1, r2, r3, r4)
            return r0
    }

    /* renamed from: b */
    public android.graphics.PorterDuffColorFilter m12917b(android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r2 = this;
            if (r3 == 0) goto L14
            if (r4 != 0) goto L5
            goto L14
        L5:
            int[] r0 = r2.getState()
            r1 = 0
            int r3 = r3.getColorForState(r0, r1)
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r4)
            return r0
        L14:
            r3 = 0
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L7
            r0.canApplyTheme()
        L7:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r11) {
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.f24467Y
            if (r0 == 0) goto L8
            r0.draw(r11)
            return
        L8:
            android.graphics.Rect r0 = r10.f24476g0
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.f24476g0
            int r0 = r0.width()
            if (r0 <= 0) goto L16b
            android.graphics.Rect r0 = r10.f24476g0
            int r0 = r0.height()
            if (r0 > 0) goto L1f
            goto L16b
        L1f:
            android.graphics.ColorFilter r0 = r10.f24471b0
            if (r0 != 0) goto L25
            android.graphics.PorterDuffColorFilter r0 = r10.f24470a0
        L25:
            android.graphics.Matrix r1 = r10.f24475f0
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.f24475f0
            float[] r2 = r10.f24474e0
            r1.getValues(r2)
            float[] r1 = r10.f24474e0
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.f24474e0
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.f24474e0
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.f24474e0
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L60
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L64
        L60:
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
        L64:
            android.graphics.Rect r4 = r10.f24476g0
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.f24476g0
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L16b
            if (r3 > 0) goto L88
            goto L16b
        L88:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.f24476g0
            int r9 = r6.left
            float r9 = (float) r9
            int r6 = r6.top
            float r6 = (float) r6
            r11.translate(r9, r6)
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto La5
            int r6 = p103g0.C2200a.m5786b(r10)
            if (r6 != r5) goto La5
            r6 = 1
            goto La6
        La5:
            r6 = 0
        La6:
            if (r6 == 0) goto Lb7
            android.graphics.Rect r6 = r10.f24476g0
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r8)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r7)
        Lb7:
            android.graphics.Rect r6 = r10.f24476g0
            r6.offsetTo(r2, r2)
            u1.g$h r6 = r10.f24469Z
            android.graphics.Bitmap r7 = r6.f24528f
            if (r7 == 0) goto Ld5
            int r7 = r7.getWidth()
            if (r1 != r7) goto Ld2
            android.graphics.Bitmap r7 = r6.f24528f
            int r7 = r7.getHeight()
            if (r3 != r7) goto Ld2
            r7 = 1
            goto Ld3
        Ld2:
            r7 = 0
        Ld3:
            if (r7 != 0) goto Ldf
        Ld5:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f24528f = r7
            r6.f24533k = r5
        Ldf:
            boolean r6 = r10.f24473d0
            if (r6 != 0) goto Le9
            u1.g$h r6 = r10.f24469Z
            r6.m12923b(r1, r3)
            goto L12d
        Le9:
            u1.g$h r6 = r10.f24469Z
            boolean r7 = r6.f24533k
            if (r7 != 0) goto L10d
            android.content.res.ColorStateList r7 = r6.f24529g
            android.content.res.ColorStateList r8 = r6.f24525c
            if (r7 != r8) goto L10d
            android.graphics.PorterDuff$Mode r7 = r6.f24530h
            android.graphics.PorterDuff$Mode r8 = r6.f24526d
            if (r7 != r8) goto L10d
            boolean r7 = r6.f24532j
            boolean r8 = r6.f24527e
            if (r7 != r8) goto L10d
            int r7 = r6.f24531i
            u1.g$g r6 = r6.f24524b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L10d
            r6 = 1
            goto L10e
        L10d:
            r6 = 0
        L10e:
            if (r6 != 0) goto L12d
            u1.g$h r6 = r10.f24469Z
            r6.m12923b(r1, r3)
            u1.g$h r1 = r10.f24469Z
            android.content.res.ColorStateList r3 = r1.f24525c
            r1.f24529g = r3
            android.graphics.PorterDuff$Mode r3 = r1.f24526d
            r1.f24530h = r3
            u1.g$g r3 = r1.f24524b
            int r3 = r3.getRootAlpha()
            r1.f24531i = r3
            boolean r3 = r1.f24527e
            r1.f24532j = r3
            r1.f24533k = r2
        L12d:
            u1.g$h r1 = r10.f24469Z
            android.graphics.Rect r3 = r10.f24476g0
            u1.g$g r6 = r1.f24524b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L13c
            r2 = 1
        L13c:
            r6 = 0
            if (r2 != 0) goto L143
            if (r0 != 0) goto L143
            r0 = r6
            goto L163
        L143:
            android.graphics.Paint r2 = r1.f24534l
            if (r2 != 0) goto L151
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f24534l = r2
            r2.setFilterBitmap(r5)
        L151:
            android.graphics.Paint r2 = r1.f24534l
            u1.g$g r5 = r1.f24524b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.f24534l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.f24534l
        L163:
            android.graphics.Bitmap r1 = r1.f24528f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L16b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            int r0 = r0.getAlpha()
            return r0
        L9:
            u1.g$h r0 = r1.f24469Z
            u1.g$g r0 = r0.f24524b
            int r0 = r0.getRootAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f24467Y
            if (r0 == 0) goto L9
            int r0 = r0.getChangingConfigurations()
            return r0
        L9:
            int r0 = super.getChangingConfigurations()
            u1.g$h r1 = r2.f24469Z
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
        L9:
            android.graphics.ColorFilter r0 = r1.f24471b0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f24467Y
            if (r0 == 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L16
            u1.g$i r0 = new u1.g$i
            android.graphics.drawable.Drawable r1 = r2.f24467Y
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L16:
            u1.g$h r0 = r2.f24469Z
            int r1 = r2.getChangingConfigurations()
            r0.f24523a = r1
            u1.g$h r0 = r2.f24469Z
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicHeight()
            return r0
        L9:
            u1.g$h r0 = r1.f24469Z
            u1.g$g r0 = r0.f24524b
            float r0 = r0.f24516j
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            int r0 = r0.getIntrinsicWidth()
            return r0
        L9:
            u1.g$h r0 = r1.f24469Z
            u1.g$g r0 = r0.f24524b
            float r0 = r0.f24515i
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            int r0 = r0.getOpacity()
            return r0
        L9:
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            r0.inflate(r2, r3, r4)
            return
        L8:
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) {
            r27 = this;
            r1 = r27
            r2 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L12
            r0.inflate(r2, r9, r10, r11)
            return
        L12:
            u1.g$h r12 = r1.f24469Z
            u1.g$g r0 = new u1.g$g
            r0.<init>()
            r12.f24524b = r0
            int[] r0 = p348u1.C6283a.f24442a
            android.content.res.TypedArray r3 = p065e0.C1505j.m4095i(r2, r11, r10, r0)
            u1.g$h r4 = r1.f24469Z
            u1.g$g r5 = r4.f24524b
            java.lang.String r0 = "tintMode"
            boolean r0 = p065e0.C1505j.m4094h(r9, r0)
            r13 = 6
            r14 = -1
            if (r0 != 0) goto L31
            r0 = -1
            goto L35
        L31:
            int r0 = r3.getInt(r13, r14)
        L35:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r15 = 9
            r8 = 5
            r7 = 3
            if (r0 == r7) goto L51
            if (r0 == r8) goto L53
            if (r0 == r15) goto L4e
            switch(r0) {
                case 14: goto L4b;
                case 15: goto L48;
                case 16: goto L45;
                default: goto L44;
            }
        L44:
            goto L53
        L45:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.ADD
            goto L53
        L48:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SCREEN
            goto L53
        L4b:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L53
        L4e:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L53
        L51:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_OVER
        L53:
            r4.f24526d = r6
            java.lang.String r0 = "tint"
            boolean r0 = p065e0.C1505j.m4094h(r9, r0)
            r13 = 0
            r15 = 1
            r14 = 2
            if (r0 == 0) goto Lb6
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r3.getValue(r15, r0)
            int r6 = r0.type
            if (r6 == r14) goto L97
            r14 = 28
            if (r6 < r14) goto L7b
            r14 = 31
            if (r6 > r14) goto L7b
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto Lb7
        L7b:
            android.content.res.Resources r0 = r3.getResources()
            int r6 = r3.getResourceId(r15, r13)
            java.lang.ThreadLocal<android.util.TypedValue> r14 = p065e0.C1499d.f7297a
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch: java.lang.Exception -> L8e
            android.content.res.ColorStateList r0 = p065e0.C1499d.m4072a(r0, r6, r11)     // Catch: java.lang.Exception -> L8e
            goto Lb7
        L8e:
            r0 = move-exception
            java.lang.String r6 = "CSLCompat"
            java.lang.String r14 = "Failed to inflate ColorStateList."
            android.util.Log.e(r6, r14, r0)
            goto Lb6
        L97:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        Lb6:
            r0 = 0
        Lb7:
            if (r0 == 0) goto Lbb
            r4.f24525c = r0
        Lbb:
            boolean r0 = r4.f24527e
            java.lang.String r6 = "autoMirrored"
            boolean r6 = p065e0.C1505j.m4094h(r9, r6)
            if (r6 != 0) goto Lc6
            goto Lca
        Lc6:
            boolean r0 = r3.getBoolean(r8, r0)
        Lca:
            r4.f24527e = r0
            float r0 = r5.f24517k
            java.lang.String r4 = "viewportWidth"
            boolean r4 = p065e0.C1505j.m4094h(r9, r4)
            r14 = 7
            if (r4 != 0) goto Ld8
            goto Ldc
        Ld8:
            float r0 = r3.getFloat(r14, r0)
        Ldc:
            r5.f24517k = r0
            float r0 = r5.f24518l
            java.lang.String r4 = "viewportHeight"
            boolean r4 = p065e0.C1505j.m4094h(r9, r4)
            r6 = 8
            if (r4 != 0) goto Leb
            goto Lef
        Leb:
            float r0 = r3.getFloat(r6, r0)
        Lef:
            r5.f24518l = r0
            float r4 = r5.f24517k
            r19 = 0
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L4da
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L4be
            float r0 = r5.f24515i
            float r0 = r3.getDimension(r7, r0)
            r5.f24515i = r0
            float r0 = r5.f24516j
            r4 = 2
            float r0 = r3.getDimension(r4, r0)
            r5.f24516j = r0
            float r4 = r5.f24515i
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L4a2
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L486
            float r0 = r5.getAlpha()
            java.lang.String r4 = "alpha"
            boolean r4 = p065e0.C1505j.m4094h(r9, r4)
            r14 = 4
            if (r4 != 0) goto L126
            goto L12a
        L126:
            float r0 = r3.getFloat(r14, r0)
        L12a:
            r5.setAlpha(r0)
            java.lang.String r0 = r3.getString(r13)
            if (r0 == 0) goto L13a
            r5.f24520n = r0
            s.a<java.lang.String, java.lang.Object> r4 = r5.f24522p
            r4.put(r0, r5)
        L13a:
            r3.recycle()
            int r0 = r27.getChangingConfigurations()
            r12.f24523a = r0
            r12.f24533k = r15
            u1.g$h r0 = r1.f24469Z
            u1.g$g r5 = r0.f24524b
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            u1.g$d r3 = r5.f24514h
            r4.push(r3)
            int r3 = r29.getEventType()
            int r20 = r29.getDepth()
            int r14 = r20 + 1
            r20 = 1
        L15f:
            if (r3 == r15) goto L46d
            int r6 = r29.getDepth()
            if (r6 >= r14) goto L169
            if (r3 == r7) goto L46d
        L169:
            java.lang.String r6 = "group"
            r7 = 2
            if (r3 != r7) goto L43e
            java.lang.String r3 = r29.getName()
            java.lang.Object r7 = r4.peek()
            u1.g$d r7 = (p348u1.C6289g.d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            java.lang.String r15 = "fillType"
            java.lang.String r13 = "pathData"
            if (r8 == 0) goto L314
            u1.g$c r8 = new u1.g$c
            r8.<init>()
            int[] r3 = p348u1.C6283a.f24444c
            android.content.res.TypedArray r6 = p065e0.C1505j.m4095i(r2, r11, r10, r3)
            r3 = 0
            r8.f24477e = r3
            boolean r13 = p065e0.C1505j.m4094h(r9, r13)
            if (r13 != 0) goto L1a9
            r24 = r4
            r25 = r5
            r1 = r6
            r13 = r8
            r18 = r14
            r17 = -1
            r21 = 8
            r22 = 9
            r14 = r7
            goto L2e6
        L1a9:
            r13 = 0
            java.lang.String r3 = r6.getString(r13)
            if (r3 == 0) goto L1b2
            r8.f24503b = r3
        L1b2:
            r3 = 2
            java.lang.String r13 = r6.getString(r3)
            if (r13 == 0) goto L1bf
            f0.d$a[] r3 = p084f0.C1941d.m4832c(r13)
            r8.f24502a = r3
        L1bf:
            r13 = 1
            r20 = 0
            java.lang.String r23 = "fillColor"
            r18 = 0
            r3 = r6
            r24 = r4
            r4 = r29
            r25 = r5
            r5 = r31
            r26 = r6
            r6 = r23
            r18 = r14
            r1 = 3
            r14 = r7
            r7 = r13
            r13 = r8
            r1 = 5
            r8 = r20
            e0.e r3 = p065e0.C1505j.m4089c(r3, r4, r5, r6, r7, r8)
            r13.f24480h = r3
            r3 = 12
            float r4 = r13.f24482j
            java.lang.String r5 = "fillAlpha"
            boolean r5 = p065e0.C1505j.m4094h(r9, r5)
            r8 = r26
            if (r5 != 0) goto L1f1
            goto L1f5
        L1f1:
            float r4 = r8.getFloat(r3, r4)
        L1f5:
            r13.f24482j = r4
            java.lang.String r3 = "strokeLineCap"
            boolean r3 = p065e0.C1505j.m4094h(r9, r3)
            if (r3 != 0) goto L203
            r3 = -1
            r7 = 8
            goto L20b
        L203:
            r3 = -1
            r7 = 8
            int r4 = r8.getInt(r7, r3)
            r3 = r4
        L20b:
            android.graphics.Paint$Cap r4 = r13.f24486n
            if (r3 == 0) goto L21c
            r5 = 1
            if (r3 == r5) goto L219
            r5 = 2
            if (r3 == r5) goto L216
            goto L21e
        L216:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
            goto L21e
        L219:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            goto L21e
        L21c:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
        L21e:
            r13.f24486n = r4
            java.lang.String r3 = "strokeLineJoin"
            boolean r3 = p065e0.C1505j.m4094h(r9, r3)
            if (r3 != 0) goto L22d
            r3 = -1
            r5 = -1
            r6 = 9
            goto L234
        L22d:
            r5 = -1
            r6 = 9
            int r3 = r8.getInt(r6, r5)
        L234:
            android.graphics.Paint$Join r4 = r13.f24487o
            if (r3 == 0) goto L245
            r5 = 1
            if (r3 == r5) goto L242
            r5 = 2
            if (r3 == r5) goto L23f
            goto L247
        L23f:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L247
        L242:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L247
        L245:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
        L247:
            r13.f24487o = r4
            r3 = 10
            float r4 = r13.f24488p
            java.lang.String r5 = "strokeMiterLimit"
            boolean r5 = p065e0.C1505j.m4094h(r9, r5)
            if (r5 != 0) goto L256
            goto L25a
        L256:
            float r4 = r8.getFloat(r3, r4)
        L25a:
            r13.f24488p = r4
            r16 = 3
            r20 = 0
            java.lang.String r21 = "strokeColor"
            r3 = r8
            r4 = r29
            r17 = -1
            r5 = r31
            r22 = 9
            r6 = r21
            r21 = 8
            r7 = r16
            r1 = r8
            r8 = r20
            e0.e r3 = p065e0.C1505j.m4089c(r3, r4, r5, r6, r7, r8)
            r13.f24478f = r3
            r3 = 11
            float r4 = r13.f24481i
            java.lang.String r5 = "strokeAlpha"
            boolean r5 = p065e0.C1505j.m4094h(r9, r5)
            if (r5 != 0) goto L287
            goto L28b
        L287:
            float r4 = r1.getFloat(r3, r4)
        L28b:
            r13.f24481i = r4
            float r3 = r13.f24479g
            java.lang.String r4 = "strokeWidth"
            boolean r4 = p065e0.C1505j.m4094h(r9, r4)
            if (r4 != 0) goto L298
            goto L29d
        L298:
            r4 = 4
            float r3 = r1.getFloat(r4, r3)
        L29d:
            r13.f24479g = r3
            float r3 = r13.f24484l
            java.lang.String r4 = "trimPathEnd"
            boolean r4 = p065e0.C1505j.m4094h(r9, r4)
            if (r4 != 0) goto L2aa
            goto L2af
        L2aa:
            r4 = 6
            float r3 = r1.getFloat(r4, r3)
        L2af:
            r13.f24484l = r3
            float r3 = r13.f24485m
            java.lang.String r4 = "trimPathOffset"
            boolean r4 = p065e0.C1505j.m4094h(r9, r4)
            if (r4 != 0) goto L2bc
            goto L2c1
        L2bc:
            r4 = 7
            float r3 = r1.getFloat(r4, r3)
        L2c1:
            r13.f24485m = r3
            float r3 = r13.f24483k
            java.lang.String r4 = "trimPathStart"
            boolean r4 = p065e0.C1505j.m4094h(r9, r4)
            if (r4 != 0) goto L2ce
            goto L2d3
        L2ce:
            r4 = 5
            float r3 = r1.getFloat(r4, r3)
        L2d3:
            r13.f24483k = r3
            r3 = 13
            int r4 = r13.f24504c
            boolean r5 = p065e0.C1505j.m4094h(r9, r15)
            if (r5 != 0) goto L2e0
            goto L2e4
        L2e0:
            int r4 = r1.getInt(r3, r4)
        L2e4:
            r13.f24504c = r4
        L2e6:
            r1.recycle()
            java.util.ArrayList<u1.g$e> r1 = r14.f24490b
            r1.add(r13)
            java.lang.String r1 = r13.getPathName()
            if (r1 == 0) goto L300
            r1 = r25
            s.a<java.lang.String, java.lang.Object> r3 = r1.f24522p
            java.lang.String r4 = r13.getPathName()
            r3.put(r4, r13)
            goto L302
        L300:
            r1 = r25
        L302:
            int r3 = r0.f24523a
            int r4 = r13.f24505d
            r3 = r3 | r4
            r0.f24523a = r3
            r4 = r24
            r6 = 0
            r7 = 5
            r8 = 1
            r13 = 2
            r15 = 4
            r20 = 0
            goto L43b
        L314:
            r24 = r4
            r1 = r5
            r18 = r14
            r17 = -1
            r21 = 8
            r22 = 9
            r14 = r7
            java.lang.String r4 = "clip-path"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L380
            u1.g$b r3 = new u1.g$b
            r3.<init>()
            boolean r4 = p065e0.C1505j.m4094h(r9, r13)
            if (r4 != 0) goto L334
            goto L363
        L334:
            int[] r4 = p348u1.C6283a.f24445d
            android.content.res.TypedArray r4 = p065e0.C1505j.m4095i(r2, r11, r10, r4)
            r5 = 0
            java.lang.String r6 = r4.getString(r5)
            if (r6 == 0) goto L343
            r3.f24503b = r6
        L343:
            r5 = 1
            java.lang.String r6 = r4.getString(r5)
            if (r6 == 0) goto L350
            f0.d$a[] r5 = p084f0.C1941d.m4832c(r6)
            r3.f24502a = r5
        L350:
            boolean r5 = p065e0.C1505j.m4094h(r9, r15)
            if (r5 != 0) goto L358
            r13 = 0
            goto L35e
        L358:
            r5 = 0
            r6 = 2
            int r13 = r4.getInt(r6, r5)
        L35e:
            r3.f24504c = r13
            r4.recycle()
        L363:
            java.util.ArrayList<u1.g$e> r4 = r14.f24490b
            r4.add(r3)
            java.lang.String r4 = r3.getPathName()
            if (r4 == 0) goto L377
            s.a<java.lang.String, java.lang.Object> r4 = r1.f24522p
            java.lang.String r5 = r3.getPathName()
            r4.put(r5, r3)
        L377:
            int r4 = r0.f24523a
            int r3 = r3.f24505d
            r3 = r3 | r4
            r0.f24523a = r3
            goto L434
        L380:
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L434
            u1.g$d r3 = new u1.g$d
            r3.<init>()
            int[] r4 = p348u1.C6283a.f24443b
            android.content.res.TypedArray r4 = p065e0.C1505j.m4095i(r2, r11, r10, r4)
            r5 = 0
            r3.f24500l = r5
            float r6 = r3.f24491c
            java.lang.String r7 = "rotation"
            boolean r7 = p065e0.C1505j.m4094h(r9, r7)
            if (r7 != 0) goto L3a0
            r7 = 5
            goto L3a5
        L3a0:
            r7 = 5
            float r6 = r4.getFloat(r7, r6)
        L3a5:
            r3.f24491c = r6
            float r6 = r3.f24492d
            r8 = 1
            float r6 = r4.getFloat(r8, r6)
            r3.f24492d = r6
            float r6 = r3.f24493e
            r13 = 2
            float r6 = r4.getFloat(r13, r6)
            r3.f24493e = r6
            float r6 = r3.f24494f
            java.lang.String r15 = "scaleX"
            boolean r15 = p065e0.C1505j.m4094h(r9, r15)
            if (r15 != 0) goto L3c4
            goto L3c9
        L3c4:
            r15 = 3
            float r6 = r4.getFloat(r15, r6)
        L3c9:
            r3.f24494f = r6
            float r6 = r3.f24495g
            java.lang.String r15 = "scaleY"
            boolean r15 = p065e0.C1505j.m4094h(r9, r15)
            if (r15 != 0) goto L3d7
            r15 = 4
            goto L3dc
        L3d7:
            r15 = 4
            float r6 = r4.getFloat(r15, r6)
        L3dc:
            r3.f24495g = r6
            float r6 = r3.f24496h
            java.lang.String r5 = "translateX"
            boolean r5 = p065e0.C1505j.m4094h(r9, r5)
            if (r5 != 0) goto L3ea
            r5 = 6
            goto L3ef
        L3ea:
            r5 = 6
            float r6 = r4.getFloat(r5, r6)
        L3ef:
            r3.f24496h = r6
            float r6 = r3.f24497i
            java.lang.String r5 = "translateY"
            boolean r5 = p065e0.C1505j.m4094h(r9, r5)
            if (r5 != 0) goto L3fd
            r5 = 7
            goto L402
        L3fd:
            r5 = 7
            float r6 = r4.getFloat(r5, r6)
        L402:
            r3.f24497i = r6
            r6 = 0
            java.lang.String r5 = r4.getString(r6)
            if (r5 == 0) goto L40d
            r3.f24501m = r5
        L40d:
            r3.m12920c()
            r4.recycle()
            java.util.ArrayList<u1.g$e> r4 = r14.f24490b
            r4.add(r3)
            r4 = r24
            r4.push(r3)
            java.lang.String r5 = r3.getGroupName()
            if (r5 == 0) goto L42c
            s.a<java.lang.String, java.lang.Object> r5 = r1.f24522p
            java.lang.String r14 = r3.getGroupName()
            r5.put(r14, r3)
        L42c:
            int r5 = r0.f24523a
            int r3 = r3.f24499k
            r3 = r3 | r5
            r0.f24523a = r3
            goto L43b
        L434:
            r4 = r24
            r6 = 0
            r7 = 5
            r8 = 1
            r13 = 2
            r15 = 4
        L43b:
            r5 = 3
            r14 = 0
            goto L45c
        L43e:
            r1 = r5
            r18 = r14
            r5 = 3
            r7 = 5
            r8 = 1
            r13 = 2
            r14 = 0
            r15 = 4
            r17 = -1
            r21 = 8
            r22 = 9
            if (r3 != r5) goto L45c
            java.lang.String r3 = r29.getName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L45c
            r4.pop()
        L45c:
            int r3 = r29.next()
            r6 = 8
            r7 = 3
            r8 = 5
            r13 = 0
            r15 = 1
            r5 = r1
            r14 = r18
            r1 = r27
            goto L15f
        L46d:
            if (r20 != 0) goto L47c
            android.content.res.ColorStateList r0 = r12.f24525c
            android.graphics.PorterDuff$Mode r1 = r12.f24526d
            r2 = r27
            android.graphics.PorterDuffColorFilter r0 = r2.m12917b(r0, r1)
            r2.f24470a0 = r0
            return
        L47c:
            r2 = r27
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "no path defined"
            r0.<init>(r1)
            throw r0
        L486:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4a2:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4be:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4da:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            r0.invalidateSelf()
            return
        L8:
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            boolean r0 = r0.isAutoMirrored()
            return r0
        L9:
            u1.g$h r0 = r1.f24469Z
            boolean r0 = r0.f24527e
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            boolean r0 = r0.isStateful()
            return r0
        L9:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L28
            u1.g$h r0 = r1.f24469Z
            if (r0 == 0) goto L26
            boolean r0 = r0.m12922a()
            if (r0 != 0) goto L28
            u1.g$h r0 = r1.f24469Z
            android.content.res.ColorStateList r0 = r0.f24525c
            if (r0 == 0) goto L26
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f24467Y
            if (r0 == 0) goto L8
            r0.mutate()
            return r2
        L8:
            boolean r0 = r2.f24472c0
            if (r0 != 0) goto L1e
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L1e
            u1.g$h r0 = new u1.g$h
            u1.g$h r1 = r2.f24469Z
            r0.<init>(r1)
            r2.f24469Z = r0
            r0 = 1
            r2.f24472c0 = r0
        L1e:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f24467Y
            if (r0 == 0) goto L9
            boolean r6 = r0.setState(r6)
            return r6
        L9:
            r0 = 0
            u1.g$h r1 = r5.f24469Z
            android.content.res.ColorStateList r2 = r1.f24525c
            r3 = 1
            if (r2 == 0) goto L1f
            android.graphics.PorterDuff$Mode r4 = r1.f24526d
            if (r4 == 0) goto L1f
            android.graphics.PorterDuffColorFilter r0 = r5.m12917b(r2, r4)
            r5.f24470a0 = r0
            r5.invalidateSelf()
            r0 = 1
        L1f:
            boolean r2 = r1.m12922a()
            if (r2 == 0) goto L38
            u1.g$g r2 = r1.f24524b
            u1.g$d r2 = r2.f24514h
            boolean r6 = r2.mo12919b(r6)
            boolean r2 = r1.f24533k
            r2 = r2 | r6
            r1.f24533k = r2
            if (r6 == 0) goto L38
            r5.invalidateSelf()
            goto L39
        L38:
            r3 = r0
        L39:
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(java.lang.Runnable r2, long r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            r0.scheduleSelf(r2, r3)
            return
        L8:
            super.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            r0.setAlpha(r2)
            return
        L8:
            u1.g$h r0 = r1.f24469Z
            u1.g$g r0 = r0.f24524b
            int r0 = r0.getRootAlpha()
            if (r0 == r2) goto L1c
            u1.g$h r0 = r1.f24469Z
            u1.g$g r0 = r0.f24524b
            r0.setRootAlpha(r2)
            r1.invalidateSelf()
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            r0.setAutoMirrored(r2)
            return
        L8:
            u1.g$h r0 = r1.f24469Z
            r0.f24527e = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            r0.setColorFilter(r2)
            return
        L8:
            r1.f24471b0 = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            p103g0.C2200a.m5788d(r0, r2)
            return
        L8:
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f24467Y
            if (r0 == 0) goto L8
            p103g0.C2200a.m5789e(r0, r3)
            return
        L8:
            u1.g$h r0 = r2.f24469Z
            android.content.res.ColorStateList r1 = r0.f24525c
            if (r1 == r3) goto L1b
            r0.f24525c = r3
            android.graphics.PorterDuff$Mode r0 = r0.f24526d
            android.graphics.PorterDuffColorFilter r3 = r2.m12917b(r3, r0)
            r2.f24470a0 = r3
            r2.invalidateSelf()
        L1b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.f24467Y
            if (r0 == 0) goto L8
            p103g0.C2200a.m5790f(r0, r3)
            return
        L8:
            u1.g$h r0 = r2.f24469Z
            android.graphics.PorterDuff$Mode r1 = r0.f24526d
            if (r1 == r3) goto L1b
            r0.f24526d = r3
            android.content.res.ColorStateList r0 = r0.f24525c
            android.graphics.PorterDuffColorFilter r3 = r2.m12917b(r0, r3)
            r2.f24470a0 = r3
            r2.invalidateSelf()
        L1b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L9
            boolean r2 = r0.setVisible(r2, r3)
            return r2
        L9:
            boolean r2 = super.setVisible(r2, r3)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(java.lang.Runnable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f24467Y
            if (r0 == 0) goto L8
            r0.unscheduleSelf(r2)
            return
        L8:
            super.unscheduleSelf(r2)
            return
    }
}
