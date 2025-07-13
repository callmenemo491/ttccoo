package androidx.media;

/* renamed from: androidx.media.AudioAttributesImplBaseParcelizer */
/* loaded from: classes.dex */
public class C0478xd44bbda5 {
    public C0478xd44bbda5() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.media.AudioAttributesImplBase read(p367v1.AbstractC6489c r3) {
            androidx.media.AudioAttributesImplBase r0 = new androidx.media.AudioAttributesImplBase
            r0.<init>()
            int r1 = r0.f2579a
            r2 = 1
            int r1 = r3.m13193k(r1, r2)
            r0.f2579a = r1
            int r1 = r0.f2580b
            r2 = 2
            int r1 = r3.m13193k(r1, r2)
            r0.f2580b = r1
            int r1 = r0.f2581c
            r2 = 3
            int r1 = r3.m13193k(r1, r2)
            r0.f2581c = r1
            int r1 = r0.f2582d
            r2 = 4
            int r3 = r3.m13193k(r1, r2)
            r0.f2582d = r3
            return r0
    }

    public static void write(androidx.media.AudioAttributesImplBase r2, p367v1.AbstractC6489c r3) {
            java.util.Objects.requireNonNull(r3)
            int r0 = r2.f2579a
            r1 = 1
            r3.mo13198p(r1)
            r3.mo13202t(r0)
            int r0 = r2.f2580b
            r1 = 2
            r3.mo13198p(r1)
            r3.mo13202t(r0)
            int r0 = r2.f2581c
            r1 = 3
            r3.mo13198p(r1)
            r3.mo13202t(r0)
            int r2 = r2.f2582d
            r0 = 4
            r3.mo13198p(r0)
            r3.mo13202t(r2)
            return
    }
}
