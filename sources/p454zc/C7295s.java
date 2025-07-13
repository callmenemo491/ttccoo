package p454zc;

/* renamed from: zc.s */
/* loaded from: classes.dex */
public class C7295s {

    /* renamed from: a */
    public p453zb.C7271c f27965a;

    /* renamed from: b */
    public int f27966b;

    /* renamed from: c */
    public int f27967c;

    /* renamed from: d */
    public android.graphics.Rect f27968d;

    /* renamed from: e */
    public boolean f27969e;

    public C7295s(byte[] r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            r2.<init>()
            zb.c r0 = new zb.c
            r0.<init>(r3, r4, r5)
            r2.f27965a = r0
            r2.f27967c = r7
            r2.f27966b = r6
            int r6 = r4 * r5
            int r7 = r3.length
            if (r6 > r7) goto L14
            return
        L14:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Image data does not match the resolution. "
            java.lang.String r0 = "x"
            java.lang.String r1 = " > "
            java.lang.StringBuilder r4 = androidx.recyclerview.widget.C0608s.m2117a(r7, r4, r0, r5, r1)
            int r3 = r3.length
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r6.<init>(r3)
            throw r6
    }
}
