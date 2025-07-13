package p215m3;

/* renamed from: m3.a */
/* loaded from: classes.dex */
public class C4349a extends p215m3.AbstractC4351c {

    /* renamed from: a */
    public java.text.DecimalFormat f17836a;

    /* renamed from: b */
    public int f17837b;

    public C4349a(int r4) {
            r3 = this;
            r3.<init>()
            r3.f17837b = r4
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        Lb:
            if (r1 >= r4) goto L1c
            if (r1 != 0) goto L14
            java.lang.String r2 = "."
            r0.append(r2)
        L14:
            java.lang.String r2 = "0"
            r0.append(r2)
            int r1 = r1 + 1
            goto Lb
        L1c:
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            java.lang.String r1 = "###,###,###,##0"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            r3.f17836a = r4
            return
    }

    @Override // p215m3.AbstractC4351c
    /* renamed from: a */
    public java.lang.String mo9734a(float r4) {
            r3 = this;
            java.text.DecimalFormat r0 = r3.f17836a
            double r1 = (double) r4
            java.lang.String r4 = r0.format(r1)
            return r4
    }
}
