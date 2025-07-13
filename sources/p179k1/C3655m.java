package p179k1;

/* renamed from: k1.m */
/* loaded from: classes.dex */
public class C3655m {

    /* renamed from: a */
    public final p243o1.InterfaceC4873c.b f16146a;

    /* renamed from: b */
    public final android.content.Context f16147b;

    /* renamed from: c */
    public final java.lang.String f16148c;

    /* renamed from: d */
    public final p179k1.AbstractC3664v.c f16149d;

    /* renamed from: e */
    public final java.util.List<java.lang.Object> f16150e;

    /* renamed from: f */
    public final java.util.List<p196l1.InterfaceC4162a> f16151f;

    /* renamed from: g */
    public final int f16152g;

    /* renamed from: h */
    public final java.util.concurrent.Executor f16153h;

    /* renamed from: i */
    public final java.util.concurrent.Executor f16154i;

    /* renamed from: j */
    public final boolean f16155j;

    /* renamed from: k */
    public final boolean f16156k;

    /* renamed from: l */
    public final boolean f16157l;

    @android.annotation.SuppressLint({"LambdaLast"})
    public C3655m(android.content.Context r3, java.lang.String r4, p243o1.InterfaceC4873c.b r5, p179k1.AbstractC3664v.c r6, java.util.List r7, boolean r8, int r9, java.util.concurrent.Executor r10, java.util.concurrent.Executor r11, android.content.Intent r12, boolean r13, boolean r14, java.util.Set r15, java.lang.String r16, java.io.File r17, java.util.concurrent.Callable r18, java.util.List r19, java.util.List r20) {
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r5
            r0.f16146a = r1
            r1 = r3
            r0.f16147b = r1
            r1 = r4
            r0.f16148c = r1
            r1 = r6
            r0.f16149d = r1
            r1 = r9
            r0.f16152g = r1
            r1 = r10
            r0.f16153h = r1
            r1 = r11
            r0.f16154i = r1
            if (r12 == 0) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0.f16155j = r1
            r1 = r13
            r0.f16156k = r1
            r1 = r14
            r0.f16157l = r1
            if (r19 != 0) goto L2d
            java.util.List r1 = java.util.Collections.emptyList()
            goto L2f
        L2d:
            r1 = r19
        L2f:
            r0.f16150e = r1
            if (r20 != 0) goto L38
            java.util.List r1 = java.util.Collections.emptyList()
            goto L3a
        L38:
            r1 = r20
        L3a:
            r0.f16151f = r1
            return
    }

    /* renamed from: a */
    public boolean m8085a(int r3, int r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            if (r3 <= r4) goto L6
            r3 = 1
            goto L7
        L6:
            r3 = 0
        L7:
            if (r3 == 0) goto Le
            boolean r3 = r2.f16157l
            if (r3 == 0) goto Le
            return r1
        Le:
            boolean r3 = r2.f16156k
            if (r3 == 0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }
}
