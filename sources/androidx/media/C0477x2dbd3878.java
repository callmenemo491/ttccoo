package androidx.media;

/* renamed from: androidx.media.AudioAttributesImplApi26Parcelizer */
/* loaded from: classes.dex */
public class C0477x2dbd3878 {
    public C0477x2dbd3878() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.media.AudioAttributesImplApi26 read(p367v1.AbstractC6489c r3) {
            androidx.media.AudioAttributesImplApi26 r0 = new androidx.media.AudioAttributesImplApi26
            r0.<init>()
            android.media.AudioAttributes r1 = r0.f2577a
            r2 = 1
            android.os.Parcelable r1 = r3.m13195m(r1, r2)
            android.media.AudioAttributes r1 = (android.media.AudioAttributes) r1
            r0.f2577a = r1
            int r1 = r0.f2578b
            r2 = 2
            int r3 = r3.m13193k(r1, r2)
            r0.f2578b = r3
            return r0
    }

    public static void write(androidx.media.AudioAttributesImplApi26 r2, p367v1.AbstractC6489c r3) {
            java.util.Objects.requireNonNull(r3)
            android.media.AudioAttributes r0 = r2.f2577a
            r1 = 1
            r3.mo13198p(r1)
            r3.mo13203u(r0)
            int r2 = r2.f2578b
            r0 = 2
            r3.mo13198p(r0)
            r3.mo13202t(r2)
            return
    }
}
