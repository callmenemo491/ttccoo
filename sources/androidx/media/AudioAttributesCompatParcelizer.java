package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public AudioAttributesCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.media.AudioAttributesCompat read(p367v1.AbstractC6489c r3) {
            androidx.media.AudioAttributesCompat r0 = new androidx.media.AudioAttributesCompat
            r0.<init>()
            androidx.media.AudioAttributesImpl r1 = r0.f2576a
            r2 = 1
            boolean r2 = r3.mo13191i(r2)
            if (r2 != 0) goto Lf
            goto L13
        Lf:
            v1.e r1 = r3.m13197o()
        L13:
            androidx.media.AudioAttributesImpl r1 = (androidx.media.AudioAttributesImpl) r1
            r0.f2576a = r1
            return r0
    }

    public static void write(androidx.media.AudioAttributesCompat r1, p367v1.AbstractC6489c r2) {
            java.util.Objects.requireNonNull(r2)
            androidx.media.AudioAttributesImpl r1 = r1.f2576a
            r0 = 1
            r2.mo13198p(r0)
            r2.m13205w(r1)
            return
    }
}
