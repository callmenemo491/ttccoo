package p407x5;

/* renamed from: x5.g */
/* loaded from: classes.dex */
public final class C6952g {

    /* renamed from: j */
    public static final java.lang.String[] f27140j = null;

    /* renamed from: k */
    public static final java.lang.String[] f27141k = null;

    /* renamed from: l */
    public static final float[] f27142l = null;

    /* renamed from: m */
    public static final float[] f27143m = null;

    /* renamed from: n */
    public static final float[] f27144n = null;

    /* renamed from: o */
    public static final float[] f27145o = null;

    /* renamed from: p */
    public static final float[] f27146p = null;

    /* renamed from: a */
    public int f27147a;

    /* renamed from: b */
    public p407x5.C6952g.a f27148b;

    /* renamed from: c */
    public p407x5.C6952g.a f27149c;

    /* renamed from: d */
    public p371v5.C6562l.a f27150d;

    /* renamed from: e */
    public int f27151e;

    /* renamed from: f */
    public int f27152f;

    /* renamed from: g */
    public int f27153g;

    /* renamed from: h */
    public int f27154h;

    /* renamed from: i */
    public int f27155i;

    /* renamed from: x5.g$a */
    public static class a {

        /* renamed from: a */
        public final int f27156a;

        /* renamed from: b */
        public final java.nio.FloatBuffer f27157b;

        /* renamed from: c */
        public final java.nio.FloatBuffer f27158c;

        /* renamed from: d */
        public final int f27159d;

        public a(p407x5.C6950e.b r3) {
                r2 = this;
                r2.<init>()
                float[] r0 = r3.f27138c
                int r1 = r0.length
                int r1 = r1 / 3
                r2.f27156a = r1
                java.nio.FloatBuffer r0 = p371v5.C6562l.m13351b(r0)
                r2.f27157b = r0
                float[] r0 = r3.f27139d
                java.nio.FloatBuffer r0 = p371v5.C6562l.m13351b(r0)
                r2.f27158c = r0
                int r3 = r3.f27137b
                r0 = 1
                if (r3 == r0) goto L26
                r0 = 2
                if (r3 == r0) goto L24
                r3 = 4
            L21:
                r2.f27159d = r3
                goto L28
            L24:
                r3 = 6
                goto L21
            L26:
                r3 = 5
                goto L21
            L28:
                return
        }
    }

    static {
            java.lang.String r0 = "uniform mat4 uMvpMatrix;"
            java.lang.String r1 = "uniform mat3 uTexMatrix;"
            java.lang.String r2 = "attribute vec4 aPosition;"
            java.lang.String r3 = "attribute vec2 aTexCoords;"
            java.lang.String r4 = "varying vec2 vTexCoords;"
            java.lang.String r5 = "void main() {"
            java.lang.String r6 = "  gl_Position = uMvpMatrix * aPosition;"
            java.lang.String r7 = "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;"
            java.lang.String r8 = "}"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            p407x5.C6952g.f27140j = r0
            java.lang.String r1 = "#extension GL_OES_EGL_image_external : require"
            java.lang.String r2 = "precision mediump float;"
            java.lang.String r3 = "uniform samplerExternalOES uTexture;"
            java.lang.String r4 = "varying vec2 vTexCoords;"
            java.lang.String r5 = "void main() {"
            java.lang.String r6 = "  gl_FragColor = texture2D(uTexture, vTexCoords);"
            java.lang.String r7 = "}"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            p407x5.C6952g.f27141k = r0
            r0 = 9
            float[] r1 = new float[r0]
            r1 = {x0052: FILL_ARRAY_DATA , data: [1065353216, 0, 0, 0, -1082130432, 0, 0, 1065353216, 1065353216} // fill-array
            p407x5.C6952g.f27142l = r1
            float[] r1 = new float[r0]
            r1 = {x0068: FILL_ARRAY_DATA , data: [1065353216, 0, 0, 0, -1090519040, 0, 0, 1056964608, 1065353216} // fill-array
            p407x5.C6952g.f27143m = r1
            float[] r1 = new float[r0]
            r1 = {x007e: FILL_ARRAY_DATA , data: [1065353216, 0, 0, 0, -1090519040, 0, 0, 1065353216, 1065353216} // fill-array
            p407x5.C6952g.f27144n = r1
            float[] r1 = new float[r0]
            r1 = {x0094: FILL_ARRAY_DATA , data: [1056964608, 0, 0, 0, -1082130432, 0, 0, 1065353216, 1065353216} // fill-array
            p407x5.C6952g.f27145o = r1
            float[] r0 = new float[r0]
            r0 = {x00aa: FILL_ARRAY_DATA , data: [1056964608, 0, 0, 0, -1082130432, 0, 1056964608, 1065353216, 1065353216} // fill-array
            p407x5.C6952g.f27146p = r0
            return
    }

    public C6952g() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static boolean m14119a(p407x5.C6950e r4) {
            x5.e$a r0 = r4.f27131a
            x5.e$a r4 = r4.f27132b
            x5.e$b[] r0 = r0.f27135a
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L1d
            r0 = r0[r3]
            int r0 = r0.f27136a
            if (r0 != 0) goto L1d
            x5.e$b[] r4 = r4.f27135a
            int r0 = r4.length
            if (r0 != r2) goto L1d
            r4 = r4[r3]
            int r4 = r4.f27136a
            if (r4 != 0) goto L1d
            goto L1e
        L1d:
            r2 = 0
        L1e:
            return r2
    }
}
