package p432y9;

/* renamed from: y9.l */
/* loaded from: classes.dex */
public class C7145l extends p124h7.C2882u0 {

    /* renamed from: Y */
    public final java.util.List<p432y9.C7136c<?>> f27591Y;

    public C7145l(java.util.List<p432y9.C7136c<?>> r3) {
            r2 = this;
            java.lang.String r0 = "Dependency cycle detected: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Object[] r1 = r3.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.f27591Y = r3
            return
    }
}
