package cz.java_webapp.horoscope;

import java.util.*;

public class ZodiacRepository {

    Map<Sign, Zodiac> listOfZodiac;

    public ZodiacRepository() {
        listOfZodiac = new HashMap<Sign, Zodiac>();

        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.taurus), new Zodiac("Your enthusiasm will get you noticed in a positive way, but don't overdo it, or else you might start getting a very bad type of attention. There's a fine line between being entertaining and being obnoxious, and you need to understand the difference. If you feel like gushing or venting about something, save it for your inner circle. These folks know you well and embrace your more extreme emotions. Letting down your guard is safe with them."));
        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.aquarius), new Zodiac("If you've been dying to experience something new in your life, you will get a grand opportunity to do so today. Someone you don't know very well will propose a crazy idea—so crazy that it just might work! Are you in or out? Gather all your courage and dive on in! You need to start taking more chances, don't you think? Risk is the only way to give yourself the excitement you're craving. You don't need another quiet, safe evening at home right now."));
        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.gemini), new Zodiac("When you're this close to reaching a goal, it can be quite tempting to cut a few corners or be a little bit conniving in order to reach that goal faster. But this is not a wise idea—the stars say that you need to continue on this path at the steady pace you've established. Let things unfold as they need to, not as you might want them to! Things have gone very well so far—so just have faith and try to be more patient."));
        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.aries), new Zodiac("Positive possibilities are all around you right now, making today a very good time to initiate any major projects you've been pondering. This could include business deals or personal undertakings. If all of the key elements are in place, you should feel free to put your signature on the dotted line with confidence. Formal relationships and contractual agreements that you enter into today are poised to really pay off."));
        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.cancer), new Zodiac("You may feel an urgent desire to embark on a few new projects today—and today is a good day for that! But make sure that you proceed carefully. Research and planning might not seem like a lot of fun, but they are necessary—you need to fully understand what you'll encounter on the road ahead. Rushing heedlessly toward something new might be very exciting, but it's not much fun to hit a dead end, now is it?"));
        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.leo), new Zodiac("Let your bold personality shine today. You will be totally fiery and full of energy, so put that to good use by pushing the envelope, saying things that everyone is thinking but no one has the courage to say and exploring all the boundaries of your world. Today is a great day to try something that you have always been just a little too scared to try. Your fears are vanishing. If you want something today, ask for it. (If you don't, you may never get it!)"));
        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.libra), new Zodiac("The people around you are going to be full of energy today—and just this once, you might be lagging a bit behind the crowd. To catch up, grab onto someone's coattails (with her or his permission, of course) and pull yourself along until you can muster up the energy to maintain your momentum on your own. Everyone is in this together, and they want you with them—so no one is going to mind if you need help catching up right now."));
        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.capricorn), new Zodiac("The wishes you've been making for one of your friends are being heard—what you've been hoping for will soon be reality. So prepare for a celebration, and think of how you'd like to express your gratitude for the good news that's coming! You will probably be given some credit for your pal's good fortune, and you deserve it. The partnership you enjoy with this person is about to blossom into a bigger, more fulfilling thing. Each of you has a lot of influence over the other's life."));
        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.pisces), new Zodiac("Some major karmic payback is coming your way today, and it will probably have a positive effect on your bottom line. Payment on an outstanding debt will be made today—and it will be accompanied by apologies for its tardiness. Try not to spend it all in one place, and remember to be generous with people who were generous with you. After all, you have to keep on putting out good energy if you want to keep getting it back."));
        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.sagittarius), new Zodiac("There is strength in numbers, as you will find out today. You may not usually be a 'joiner,' but if you become part of a crowd today, you won't be sorry. Positive things will start happening faster than you could have hoped for. Don't worry—this is not a case of becoming a sheep just for the sake of fitting in. You won't lose your identity just by being part of a group of people, especially if those people share your goals and ideals."));
        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.scorpio), new Zodiac("Your unconscious mind is making choices you might not be aware of. Today, it's time to take a larger view of your life and your recent actions. Things might be in danger of getting a bit out of control. If you've been spending a lot of money, it's time to start sticking to a budget and cutting out one or two indulgences. Discipline is good for you right now—it will prepare you for something big that's coming soon. You won't regret delaying gratification."));
        listOfZodiac.put(new Sign(Sign.TypeOFZodiac.virgo), new Zodiac("A person who recently made a big splash in your life is starting to act a bit unusual—keep your distance for the next few days, or at least until you get a better idea of who this person really is. The first impression he or she made may have been orchestrated very carefully. It's going to take a little bit more time for you to figure out what the truth behind the facade is. Don't rush yourself."));

    }

    public String findHoroscope(String sign) {
        String horoscope = "This zodiac sign does not exist!";

        for (Map.Entry<Sign, Zodiac> entry : listOfZodiac.entrySet()) {

            if (entry.getKey().toString().equals(sign)) {

                horoscope = entry.getValue().toString();
                return horoscope;
            }
        }

        return horoscope;
    }
}
