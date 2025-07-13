package p215m3;

/* renamed from: m3.b */
/* loaded from: classes.dex */
public class C4350b extends p215m3.AbstractC4351c {

    /* renamed from: a */
    public java.text.DecimalFormat f17838a;

    public C4350b(int r1) {
            r0 = this;
            r0.<init>()
            r0.m9735b(r1)
            return
    }

    @Override // p215m3.AbstractC4351c
    /* renamed from: a */
    public java.lang.String mo9734a(float r4) {
            r3 = this;
            java.text.DecimalFormat r0 = r3.f17838a
            double r1 = (double) r4
            java.lang.String r4 = r0.format(r1)
            return r4
    }

    /* renamed from: b */
    public void m9735b(int r4) {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L6:
            if (r1 >= r4) goto L17
            if (r1 != 0) goto Lf
            java.lang.String r2 = "."
            r0.append(r2)
        Lf:
            java.lang.String r2 = "0"
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L17:
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            java.lang.String r1 = "###,###,###,##0"
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            r3.f17838a = r4
            return
    }
}
